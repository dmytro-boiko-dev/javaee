package com;

import org.apache.commons.lang.math.NumberUtils;

public class NumberUtilsTest {
    public static void main(String[] args) {
        boolean isDigits = NumberUtils.isDigits("123124asff");
        System.out.println(isDigits);
    }
}
