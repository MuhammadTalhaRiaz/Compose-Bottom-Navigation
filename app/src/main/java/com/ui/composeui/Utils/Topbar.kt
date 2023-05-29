package com.ui.composeui.Utils

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.ui.composeui.R
import com.ui.composeui.ui.theme.primary


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {

    TopAppBar(
        title = {
            Text(text = stringResource(R.string.app_name),
                fontSize = 20.sp,
            color = Color.White
            )
                },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = primary)

    )
}