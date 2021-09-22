package com.epam.utils;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {

    @Test
    public void test_isPositiveNumber_returnTrueWhenNumberIsPositive() {
        assertTrue(StringUtils.isPositiveNumber("42"));
    }

    @Test
    public void test_isPositiveNumber_returnFalseWhenNumberIsNotPositive() {
        assertFalse(StringUtils.isPositiveNumber("-42"));
    }

    @Test(expected = NumberFormatException.class)
    public void test_isPositiveNumber_throwsExceptionWhenStringIsNotNumber() {
        StringUtils.isPositiveNumber("");
    }
}