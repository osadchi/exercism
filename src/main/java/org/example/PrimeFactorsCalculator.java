package org.example;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactorsCalculator {

    List<Long> calculatePrimeFactorsOf(long number) {
        List<Long> result = new ArrayList<>();
        Long delimiter = 2L;
        while (number >= 2L)
        {
            if (number % delimiter == 0)
            {
                number = number / delimiter;
                result.add(delimiter);
            }
            else
            {
                ++delimiter;
            }
        }
        return result;
    }

}
