package com.ui.composeui.Screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ui.composeui.R

@Composable
fun HomeScreen() {
    CardWithShape()
}
@Composable
fun CardWithShape() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        )
        {
            Card(modifier = Modifier.padding(8.dp).requiredHeight(100.dp).weight(1f)){
                // Content of the first card
                Row(
                    modifier = Modifier.padding(10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cardimage),
                        contentDescription = null,
                    )
                    Text(
                        text = "This is a text",
                        Modifier.padding(8.dp),
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                        ),
                    )
                }
            }
            Card (modifier = Modifier.padding(8.dp).requiredHeight(100.dp).weight(1f)){
                // Content of the first card
                Row(
                    modifier = Modifier.padding(10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cardimage),
                        contentDescription = null,
                    )
                    Text(
                        text = "This is a text",
                        Modifier.padding(8.dp),
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                        ),
                    )
                }
            }
        }
        CardView()
        DropDown()
    }
}
//DropDown
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropDown(){

    // Declaring a boolean value to store
    // the expanded state of the Text Field
    var mExpanded by remember { mutableStateOf(false) }

    // Create a list of cities
    val dropDownValues = listOf("Dropdown 1", "Dropdown 2", "Dropdown 3", "Dropdown 4",
        "Dropdown 5", "Dropdown 6")
    var mSelectedText by remember { mutableStateOf("") }
    // Up Icon when expanded and down icon when collapsed
    val icon = if (mExpanded)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown
    Column(Modifier.padding(8.dp)) {

        OutlinedTextField(
            value = mSelectedText,
            onValueChange = { mSelectedText = it },
            modifier = Modifier
                .fillMaxWidth(),

            label = {Text("Dropdown")},
            trailingIcon = {
                Icon(icon,"contentDescription",
                    Modifier.clickable { mExpanded = !mExpanded })
            }
        )

        // Create a drop-down menu with list of cities,
        // when clicked, set the Text Field text as the city selected
        DropdownMenu(
            expanded = mExpanded,
            onDismissRequest = { mExpanded = false },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            dropDownValues.forEach { label ->
                DropdownMenuItem(onClick = {
                    mSelectedText = label
                    mExpanded = false
                }) {
                    Text(text = label)
                }
            }
        }
    }
}

@Composable
fun CardView(){
    Card(modifier = Modifier.fillMaxWidth()
        .padding(16.dp)){
        // Content of the first card
        Row(
            modifier = Modifier.padding(10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.cardimage),
                contentDescription = null,
            )
            Text(
                text = "This is a text",
                Modifier.padding(8.dp),
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                ),
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    DropDown()
}
