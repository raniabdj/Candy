package com.example.apptestr1.utiles

sealed class Status {
    class SUCCESS(val success: Any): Status()
    class LOADING(val isLoading: Boolean = true) : Status()
    class ERROR(val error: Throwable): Status()
}