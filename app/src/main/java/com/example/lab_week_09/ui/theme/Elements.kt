package com.example.lab_week_09.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier

@Composable
fun OnBackgroundTitleText(text: String) {
    TitleText(text = text, color = MaterialTheme.colorScheme.onBackground)
}

@Composable
fun OnBackgroundItemText(text: String) {
    ItemText(text = text, color = MaterialTheme.colorScheme.onBackground)
}

@Composable
fun TitleText(text: String, color: Color) {
    Text(text = text, style = MaterialTheme.typography.titleLarge, color = color)
}

@Composable
fun ItemText(text: String, color: Color) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyLarge,
        color = color,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(4.dp)
    )
}

@Composable
fun PrimaryTextButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray, contentColor = Color.White)
    ) {
        Text(text = text, style = MaterialTheme.typography.labelMedium)
    }
}
