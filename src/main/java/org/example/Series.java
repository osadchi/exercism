package org.example;

import java.util.List;
import java.util.ArrayList;

public class Series {

    String value = "";

    Series(String string) {
        if (string.isEmpty())
            throw new IllegalArgumentException("series cannot be empty");
        value = string;
    }

    List<String> slices(int num) {
        if (num <= 0)
            throw new IllegalArgumentException("slice length cannot be negative or zero");
        if (num > value.length())
            throw new IllegalArgumentException("slice length cannot be greater than series length");
        List<String> result = new ArrayList<>();
        String set = String.valueOf(value);
        for (int i = 0; i + num <= set.length(); ++i)
        {
            result.add(set.substring(i, i+num));
        }
        return result;
    }
}
