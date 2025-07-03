package com.example.shayariapp

import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shayariapp.Routing.ShayariRoutingItem
import com.example.shayariapp.ui.theme.primary
import com.example.shayariapp.ui.theme.primaryLight
import com.example.shayariapp.ui.theme.purple
import kotlinx.coroutines.launch

@Composable
@Preview
fun PreviewFinalScreen() {
    FinalShayariScreen("Tere pyaar mein kho gaye hum")
}

@Composable
fun FinalShayariScreen(finalShayari: String) {
    Surface {
        val context = LocalContext.current

        val clipboardManager = LocalClipboardManager.current
        val coroutineScope = rememberCoroutineScope()

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = primary),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp),
                shape = RoundedCornerShape(15.dp),
                colors = CardDefaults.cardColors(containerColor = primaryLight.copy(0.8f)),
                border = BorderStroke(width = 2.dp, color = Color.White)
            ) {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        text = finalShayari,
                        color = Color.White,
                        style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold),
                        textAlign = TextAlign.Center
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                //share icon
                Card(
                    modifier = Modifier
                        .size(45.dp, 35.dp)
                        .clickable {
                            val sendIntent = Intent().apply {
                                action = Intent.ACTION_SEND
                                putExtra(Intent.EXTRA_TEXT, finalShayari)
                                type = "text/plain"
                            }
                            val shareIntent = Intent.createChooser(sendIntent, null)
                            context.startActivity(shareIntent)
                        },
                    colors = CardDefaults.cardColors(containerColor = primaryLight.copy(0.7f)),
                    shape = RoundedCornerShape(100.dp)
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Icon(
                            painterResource(id = R.drawable.ic_share),
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                }

                //Copy icon
                Card(
                    modifier = Modifier
                        .size(55.dp, 40.dp)
                        .clickable {
                            coroutineScope.launch {
                                clipboardManager.setText(AnnotatedString(finalShayari))
                                Toast.makeText(context, "Copied!", Toast.LENGTH_SHORT).show()
                            }
                        },
                    colors = CardDefaults.cardColors(containerColor = primaryLight.copy(0.7f)),
                    shape = RoundedCornerShape(100.dp)
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Icon(
                            painterResource(id = R.drawable.ic_copy),
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                }
            }
        }
    }

}