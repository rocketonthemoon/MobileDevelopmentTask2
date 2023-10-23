package com.example.task2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.task2.ui.theme.Task2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView2)

        button.setOnClickListener {
            val text = editText.text.toString().trim()
            if (text.isEmpty()) {
                Toast.makeText(this, "Please enter some text", Toast.LENGTH_SHORT).show()
            } else {
                val selectedOption = spinner.selectedItem.toString()
                val count = if (selectedOption == "Words") {
                    Count.countWords(text)
                } else {
                    Count.countChars(text)
                }
                textView.text = "Count: $count"
            }
        }
    }
}
