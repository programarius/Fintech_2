package com.example.fintech_2

import org.junit.Test

import org.junit.Assert.*

class TextUtilsUnitTest {
    @Test
    fun given_emptyString_when_charCountIsPerformed_then_zeroIsReturned() {
        val input: String = "";

        val expected: Int = 0;
        val actual: Int = TextUtils.charCount(input);

        assertEquals(expected, actual)
    }

    @Test
    fun given_emptyString_when_wordCountIsPerformed_then_zeroIsReturned() {
        val input: String = "";

        val expected: Int = 0;
        val actual: Int = TextUtils.wordCount(input);

        assertEquals(expected, actual)
    }

    @Test
    fun given_textString_when_charCountIsPerformed_then_elevenIsReturned() {
        val input: String = "Hello world";

        val expected: Int = 11;
        val actual: Int = TextUtils.charCount(input);

        assertEquals(expected, actual)
    }

    @Test
    fun given_textString_when_wordCountIsPerformed_then_twoIsReturned() {
        val input: String = "Hello world";

        val expected: Int = 2;
        val actual: Int = TextUtils.wordCount(input);

        assertEquals(expected, actual)
    }

    @Test
    fun given_textStringOnlyWithSpaces_when_charCountIsPerformed_then_fiveIsReturned() {
        val input: String = "     ";

        val expected: Int = 5;
        val actual: Int = TextUtils.charCount(input);

        assertEquals(expected, actual)
    }

    @Test
    fun given_textStringOnlyWithSpaces_when_wordCountIsPerformed_then_zeroIsReturned() {
        val input: String = "     ";

        val expected: Int = 0;
        val actual: Int = TextUtils.wordCount(input);

        assertEquals(expected, actual)
    }

    @Test
    fun given_textStringWithExcessiveSpaces_when_charCountIsPerformed_then_sixteenIsReturned() {
        val input: String = "  hello  world  ";

        val expected: Int = 16;
        val actual: Int = TextUtils.charCount(input);

        assertEquals(expected, actual)
    }

    @Test
    fun given_textStringWithExcessiveSpaces_when_wordCountIsPerformed_then_twoIsReturned() {
        val input: String = "  hello  world  ";

        val expected: Int = 2;
        val actual: Int = TextUtils.wordCount(input);

        assertEquals(expected, actual)
    }
}