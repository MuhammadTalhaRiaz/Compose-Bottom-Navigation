package com.ui.composeui.Screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ui.composeui.ListModel
import com.ui.composeui.R

@Composable
fun ListScreen() {
    Surface() {
        ListView(LocalContext.current)
    }
}

    @Composable
    fun ListView(context: Context) {
        // in the below line, we are creating and
        // initializing our array list
        lateinit var courseList: List<ListModel>
        courseList = ArrayList<ListModel>()

        // in the below line, we are adding data to our list.
        courseList = courseList + ListModel("Title", R.drawable.bike1)
        courseList = courseList + ListModel("Title", R.drawable.bike2)
        courseList = courseList + ListModel("Title", R.drawable.bike3)
        courseList = courseList + ListModel("Title", R.drawable.bike4)
        courseList = courseList + ListModel("Title", R.drawable.bike1)
        courseList = courseList + ListModel("Title", R.drawable.bike3)
        courseList = courseList + ListModel("Title", R.drawable.bike4)

        // in the below line, we are creating a
        // lazy row for displaying a horizontal list view.
        LazyColumn {
            // in the below line, we are setting data for each item of our listview.
            itemsIndexed(courseList) { index, item ->
                // in the below line, we are creating a card for our list view item.
                Card(
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme
                        .colorScheme.primary.copy(alpha = 0.8f).compositeOver(Color.White)),
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                        .clickable {
                            Toast
                                .makeText(
                                    context,
                                    courseList[index].name + " selected..",
                                    Toast.LENGTH_SHORT
                                )
                                .show()
                        },

                    )
                {
                    // in the below line, we are creating
                    // a row for our list view item.
                    Row(
                        // for our row we are adding modifier
                        // to set padding from all sides.
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth(),
                    ) {
                        // in the below line, inside row we are adding spacer
                        Spacer(modifier = Modifier.height(5.dp))

                        // in the below line, we are adding Image to display the image.
                        Image(
                            // in the below line, we are specifying the drawable image for our image.
                            painter = painterResource(id = courseList[index].image),

                            // in the below line, we are specifying
                            // content description for our image
                            contentDescription = "img",

                            // in the below line, we are setting height
                            // and width for our image.
                            modifier = Modifier
                                .height(80.dp)
                                .width(80.dp)
                                .padding(5.dp),

                            alignment = Alignment.Center
                        )

                        // in the below line, we are adding spacer between image and a text
                        Spacer(modifier = Modifier.height(5.dp))

                        // in the below line, we are creating a text.
                        Text(
                            // inside the text on below line we are
                            // setting text as the language name
                            // from our model class.
                            text = courseList[index].name,

                            // in the below line, we are adding padding
                            // for our text from all sides.
                            modifier = Modifier.padding(24.dp),

                            // in the below line, we are adding color for our text
                            color = Color.Black, textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }

    }


@Preview(showBackground = true)
@Composable
fun ListScreenPreview() {
    ListScreen()
}