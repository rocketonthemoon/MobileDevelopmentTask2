package com.example.task2

import org.junit.Assert.assertEquals
import org.junit.Test

class CountTest {
    @Test
    fun countWords_isCorrect() {
        val text = "Hello World"
        val result = Count.countWords(text)
        assertEquals(2, result)
    }

    @Test
    fun countChars_isCorrect() {
        val text = "Hello"
        val result = Count.countChars(text)
        assertEquals(5, result)
    }
}