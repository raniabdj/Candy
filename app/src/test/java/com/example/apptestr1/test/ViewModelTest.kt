package com.example.apptestr1.test

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.example.apptestr1.network.ExchangeRepository
import com.example.apptestr1.utiles.Status
import com.example.apptestr1.utiles.getOutputData
import com.example.apptestr1.viewModels.UserViewModel
import junit.framework.Assert
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.TestCoroutineDispatcher
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import javax.net.ssl.SSLEngineResult

@RunWith(MockitoJUnitRunner::class)
class ViewModelTest {

    @get:Rule
    val testInstantTaskExecutorRule: TestRule = InstantTaskExecutorRule()

    @OptIn(ExperimentalCoroutinesApi::class)
    @get:Rule
    val testCoroutineRule = TestCoroutines()

    @Mock
    lateinit var getUsersInfo: ExchangeRepository
    private val outputdata= getOutputData()
    @Mock
    lateinit var observer: Observer<Status>

    private lateinit var viewModel: UserViewModel
    private val testDispatcher = TestCoroutineDispatcher()


    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        viewModel = UserViewModel(getUsersInfo)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `make sure the result is not null`() =
        testCoroutineRule.runBlockingTest {
            val expectedOutput = Status.SUCCESS(outputdata)
            viewModel.usersLiveData.observeForever(observer)
            Mockito.`when`(viewModel.usersLiveData.value).thenAnswer {
                flowOf(expectedOutput)
            }
            viewModel.subscribeToUsersList()

            Assert.assertNotNull(viewModel.usersLiveData.value)
        }
}