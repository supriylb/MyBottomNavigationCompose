package com.example.mybottomnavigationcompose.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.mybottomnavigationcompose.R
import com.example.mybottomnavigationcompose.ui.component.ScreenContent

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
) {
    ScreenContent(
        text = stringResource(R.string.this_is_profile_fragment),
        modifier = modifier,
    )
}
