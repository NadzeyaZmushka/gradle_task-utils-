package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        if (org.apache.commons.lang3.StringUtils.isBlank(str) || !NumberUtils.isCreatable(str)) {
            throw new NumberFormatException();
        }
        return NumberUtils.toDouble(str) >= 0;
    }

}
