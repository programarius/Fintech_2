package com.example.fintech_2

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.time.Duration

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var spinner: Spinner
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        editText = findViewById(R.id.editText)
        spinner = findViewById(R.id.spinner)
        textView = findViewById(R.id.textView)
    }

    fun onCalculateClick(view: View) {
        if (editText.text.toString().isEmpty()) {
            val toast = Toast.makeText(this, R.string.toast_text, Toast.LENGTH_LONG) // in Activity
            toast.show()
            return
        }

        var result: Int

        if (spinner.selectedItem.toString() == "žodžiai") {
            result = TextUtils.wordCount(editText.text.toString())
        } else {
            result = TextUtils.charCount(editText.text.toString())
        }

        textView.text = getString(R.string.result_text, result.toString())
    }
}