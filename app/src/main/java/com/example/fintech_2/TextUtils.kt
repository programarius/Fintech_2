package com.example.fintech_2

class TextUtils {
    companion object {
        fun wordCount(text: String): Int {
            return text.split(' ').count()
        }

        fun charCount(text: String): Int {
            return text.length
        }
    }
}