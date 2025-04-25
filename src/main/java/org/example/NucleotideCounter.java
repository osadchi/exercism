package org.example;

import java.util.Map;
import java.util.HashMap;

public class NucleotideCounter {

    Map<Character, Integer> counter = new HashMap<>(Map.of('A', 0, 'C', 0, 'G', 0, 'T', 0));

    NucleotideCounter(String sequence) {
        for (Character a_ : sequence.toCharArray())
        {
            switch (a_)
            {
                case 'A':
                case 'C':
                case 'G':
                case 'T':
                    counter.merge(a_, 1, Integer::sum);
                    break;
                default:
                    throw new IllegalArgumentException("");
            }
        }
    }

    Map<Character, Integer> nucleotideCounts() {
        return counter;
    }

}
