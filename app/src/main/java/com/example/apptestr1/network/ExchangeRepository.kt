package com.example.apptestr1.network

import com.example.apptestr1.utiles.Status
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

interface ExchangeRepository {
    val userresponseFlow: StateFlow<Status>
    val tagresponseFlow: StateFlow<Status>
    suspend fun getUsersList(username: String = "")
    suspend fun getTagList(userid: String)
}

class ExchangeRepositoryImpl(
    private val stackExchangeApi: ApiExchange
) : ExchangeRepository {

    private val _userresponseFlow: MutableStateFlow<Status> = MutableStateFlow(Status.LOADING())

    override val userresponseFlow: StateFlow<Status>
        get() = _userresponseFlow

    private val _tagresponseFlow: MutableStateFlow<Status> = MutableStateFlow(Status.LOADING())

    override val tagresponseFlow: StateFlow<Status>
        get() = _tagresponseFlow

    override suspend fun getUsersList(username: String) {
        try {
            val response = stackExchangeApi.getUsersList(username)

            if (response.isSuccessful) {
                response.body()?.let {
                    _userresponseFlow.value = Status.SUCCESS(it)
                } ?: run {
                    _userresponseFlow.value =
                        Status.ERROR(IllegalStateException("User details are coming as null!"))
                }
            } else {
                _userresponseFlow.value = Status.ERROR(Exception(response.errorBody()?.string()))
            }
        } catch (e: Exception) {
            _userresponseFlow.value = Status.ERROR(e)
        }
    }

    override suspend fun getTagList(userid: String) {
        try {
            val response = stackExchangeApi.getTopTags(userid)

            if (response.isSuccessful) {
                response.body()?.let {
                    _tagresponseFlow.value = Status.SUCCESS(it)
                } ?: run {
                    _tagresponseFlow.value =
                        Status.ERROR(IllegalStateException("Tag details are coming as null!"))
                }

            } else {
                _tagresponseFlow.value = Status.ERROR(Exception(response.errorBody()?.string()))
            }
        } catch (e: Exception) {
            _tagresponseFlow.value = Status.ERROR(e)
        }
    }


}