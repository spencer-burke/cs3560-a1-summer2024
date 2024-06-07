package com.project;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MiscellaneousTest {

    private String getPaddedInteger(int arg, int extraLength) {
        int maxLength = Integer.toString(extraLength).length();
        String strInt = Integer.toString(arg);
        int lengthToPad = maxLength - strInt.length();
        String result = strInt;
        for (int i = 0; i < lengthToPad; i++)
            result = "0" + result;
        return result;
    }

    @Test
    public void getPaddedIntegerTest() {
        String expected = "07";
        String result = getPaddedInteger(7, 10);
        assertTrue(expected.equals(result));
    }

}
