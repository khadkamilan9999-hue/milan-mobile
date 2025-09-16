package com.example.assignment2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.assignment2.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val repo: Repository): ViewModel() {
    private val _state = MutableStateFlow<Result<String>?>(null)
    val state: StateFlow<Result<String>?> = _state

    fun submit(campus: String, username: String, password: String) = viewModelScope.launch {
        runCatching { repo.login(campus, username, password) }
            .onSuccess { _state.value = Result.success(it) }
            .onFailure { _state.value = Result.failure(it) }
    }
}
