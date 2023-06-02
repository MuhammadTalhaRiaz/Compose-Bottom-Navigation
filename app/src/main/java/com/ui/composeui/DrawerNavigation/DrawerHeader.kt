package com.ui.composeui.DrawerNavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DrawerHeader(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 64.dp)
        ,
        horizontalArrangement = Arrangement.Center,
    ) {
        Text(text = "Header", fontSize = 60.sp)
    }
}