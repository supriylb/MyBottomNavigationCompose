package com.example.mybottomnavigationcompose.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mybottomnavigationcompose.ui.component.ScreenContent
import com.example.mybottomnavigationcompose.ui.viewmodel.HomeViewModel

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(),
) {
    val text by viewModel.text.collectAsStateWithLifecycle()

    ScreenContent(
        text = text,
        modifier = modifier,
    )
}
