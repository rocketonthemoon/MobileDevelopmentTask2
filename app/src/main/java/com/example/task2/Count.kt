package com.example.task2

class Count {
    companion object {
        fun countWords(text: String): Int {
            val words = text.split("[\\s,.]+".toRegex())
            return words.size
        }

        fun countChars(text: String): Int {
            return text.length
        }
    }
}