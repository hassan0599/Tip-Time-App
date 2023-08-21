package com.example.tiptime

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {
    @Test
    fun calculateTip_20Percent_NoRoundUp() {
        val amount = 10.0
        val tipPercent = 20.0
        val roundUp = false
        val expectedTip = NumberFormat.getCurrencyInstance().format(2.0)
        val actualTip = calculateTip(amount, tipPercent, roundUp)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_15Percent_RoundUp() {
        val amount = 50.0
        val tipPercent = 15.0
        val roundUp = true
        val expectedTip = NumberFormat.getCurrencyInstance().format(8.0)
        val actualTip = calculateTip(amount, tipPercent, roundUp)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_25Percent_NoRoundUp() {
        val amount = 30.0
        val tipPercent = 25.0
        val roundUp = false
        val expectedTip = NumberFormat.getCurrencyInstance().format(7.5)
        val actualTip = calculateTip(amount, tipPercent, roundUp)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_10Percent_RoundUp() {
        val amount = 75.0
        val tipPercent = 10.0
        val roundUp = true
        val expectedTip = NumberFormat.getCurrencyInstance().format(8.0)
        val actualTip = calculateTip(amount, tipPercent, roundUp)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_ZeroAmount() {
        val amount = 0.0
        val tipPercent = 18.0
        val roundUp = false
        val expectedTip = NumberFormat.getCurrencyInstance().format(0.0)
        val actualTip = calculateTip(amount, tipPercent, roundUp)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_NegativeAmount() {
        val amount = -50.0
        val tipPercent = 20.0
        val roundUp = false
        val expectedTip = NumberFormat.getCurrencyInstance().format(-10.0)
        val actualTip = calculateTip(amount, tipPercent, roundUp)
        assertEquals(expectedTip, actualTip)
    }
}