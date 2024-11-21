package com.example.ucp1pam

import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun SectionHeader(){
    Box(modifier = Modifier.fillMaxWidth()
        .background(Color.DarkGray)) {
        Row (
            modifier = Modifier.padding(15.dp)
        ) {
            Box(contentAlignment = Alignment.BottomEnd) {
                Image(
                    painter = painterResource(id = R.drawable.umy),
                    contentDescription = "", Modifier.size(100.dp)
                )
                Icon(
                    Icons.Filled.Check, contentDescription = " ",
                    Modifier.padding(end = 10.dp).size(25.dp),
                    tint = Color.Red,
                )
            }
            Column (Modifier.padding(15.dp)){
                Text(text="Teknologi Informasi", color = Color.White
                )
                Spacer(Modifier.padding(3.dp))
                Text(text = "Universitas muhammadiyah yogyakarta", color =Color.White
                )
            }
        }

    }

}