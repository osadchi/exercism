package org.example;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class BaseConverter {

    int base = 0;
    int[] digits;

    BaseConverter(int originalBase, int[] originalDigits) {
        if (originalBase < 2)
        {
            throw new IllegalArgumentException("Bases must be at least 2.");
        }
        for (int d : originalDigits)
        {
            if (d < 0)
            {
                throw new IllegalArgumentException("Digits may not be negative.");
            }
            else if (d >= originalBase)
            {
                throw new IllegalArgumentException("All digits must be strictly less than the base.");
            }
        }
        base = originalBase;
        digits = originalDigits;
    }

    int[] convertToBase(int newBase) {

        if (newBase < 2)
        {
            throw new IllegalArgumentException("Bases must be at least 2.");
        }

        int value = 0;
        for (int i = 0; i < digits.length; ++i)
        {
            value = value * base + digits[i];
        }

        if (value == 0)
            return new int[]{0};

        List<Integer> result = new ArrayList<>();

        while (value > 0)
        {
            int digit = (int) ( value % newBase );
            result.add(digit);
            value /= newBase;
        }

        Collections.reverse(result);
        int[] newResult = result.stream().mapToInt(Integer::intValue).toArray();
        return newResult;

    }

}