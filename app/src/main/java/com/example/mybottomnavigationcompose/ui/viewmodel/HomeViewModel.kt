package com.example.mybottomnavigationcompose.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ViewModel() {
    val text: StateFlow<String> = MutableStateFlow("This is Home Fragment").asStateFlow()
}
