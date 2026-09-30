package com.example.mybottomnavigationcompose.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DashboardViewModel : ViewModel() {
    val text: StateFlow<String> = MutableStateFlow("This is Dashboard Fragment").asStateFlow()
}
