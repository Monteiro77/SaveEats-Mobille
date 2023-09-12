package br.senai.sp.jandira.homecomponents.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Form() {
    Column {
        Column {
            Text(text = "")
            LazyRow(content = {})
        }
        Column {
            LazyRow(content = {})
            Row {
                Card {

                }
                Card {

                }
                Card {

                }
            }

            Text(text = "")
            LazyColumn(content = {})
        }
    }

}

@Preview
@Composable
fun FormPreview() {
    Form()

}