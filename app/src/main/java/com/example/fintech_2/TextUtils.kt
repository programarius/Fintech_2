package com.example.fintech_2

class TextUtils {
    companion object {
        fun wordCount(text: String): Int {
            val clearedText: String = text.trim().replace("\\s+".toRegex(), " ");

            if (clearedText.isEmpty()) {
                return 0;
            }

            return clearedText.split(' ').count()
        }

        fun charCount(text: String): Int {
            return text.length
        }
    }
}