package com.example.apptestr1.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apptestr1.network.ExchangeRepository
import com.example.apptestr1.utiles.Status
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.*
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val exchangeRepository: ExchangeRepository,
) : ViewModel() {

  //  private val coroutineScope: CoroutineScope = CoroutineScope(SupervisorJob() + ioDispatcher)

    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
    private val compositeDisposable = CompositeDisposable()
    private var _responseState: MutableLiveData<Status> = MutableLiveData(Status.LOADING())
    val responseState: LiveData<Status> = _responseState
    private val _usersLiveData: MutableLiveData<Status> = MutableLiveData(Status.LOADING())
    val usersLiveData: LiveData<Status> get() = _usersLiveData

    private val _tagsLiveData: MutableLiveData<Status> = MutableLiveData(Status.LOADING())
    val tagsLiveData: LiveData<Status> get() = _tagsLiveData

    private fun collectState() {

        viewModelScope.launch(ioDispatcher) {
            exchangeRepository.userresponseFlow.collect { uistate ->
                _responseState.postValue(uistate)
            }
        }
    }



    private fun collectUsersList() {
        viewModelScope.launch(ioDispatcher) {

            exchangeRepository.userresponseFlow.collect { uiState ->
                when(uiState) {
                    is Status.LOADING -> { _usersLiveData.postValue(uiState) }
                    is Status.SUCCESS -> { _usersLiveData.postValue(uiState) }
                    is Status.ERROR -> { _usersLiveData.postValue(uiState) }
                }
            }
        }
    }


    fun subscribeToUsersList(username:String="") {
        _usersLiveData.postValue(Status.LOADING())
        collectUsersList()
        viewModelScope.launch(ioDispatcher) {
            exchangeRepository.getUsersList(username)
        }
    }



    fun subscribeToTagsList(userid:String) {
        _tagsLiveData.postValue(Status.LOADING())
        collectTagsList()
        viewModelScope.launch(ioDispatcher) {
            exchangeRepository.getTagList(userid)
        }
    }

    private fun collectTagsList() {
        viewModelScope.launch(ioDispatcher) {
            exchangeRepository.tagresponseFlow.collect { uiState ->
                when(uiState) {
                    is Status.LOADING -> { _tagsLiveData.postValue(uiState) }
                    is Status.SUCCESS -> { _tagsLiveData.postValue(uiState) }
                    is Status.ERROR -> { _tagsLiveData.postValue(uiState) }
                }
            }
        }
    }


    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }


}