package org.example;

import java.util.*;

public class Alphametics {

    private List<Character> letters;
    private Set<Character> leadingLetters;
    //
    private Map<Character, Integer> assigned = new HashMap<>();
    private Set<Integer> usedDigits = new HashSet<>();
    //
    private String[] leftOperands;
    private String rightOperand;

    Alphametics(String userInput) {
        parseEquation(userInput);

        if (letters != null)
        {
            letters.sort((a, b) -> {
                boolean aIsLeading = leadingLetters.contains(a);
                boolean bIsLeading = leadingLetters.contains(b);

                if (aIsLeading != bIsLeading)
                {
                    return aIsLeading ? -1 : 1;
                }
                return 0;
            });
        }
    }

    Map<Character, Integer> solve() throws UnsolvablePuzzleException {
        Map<Character, Integer> result = backtrack(0, letters);
        if (result == null)
            throw new UnsolvablePuzzleException();
        else
        {
            Set<Integer> unique = new HashSet<>(result.values());
            if (unique.size() < result.values().size())
                throw new UnsolvablePuzzleException();
        }
        return result;
    }

    private void parseEquation(String equation)
    {
        String[] parts = equation.split("\\s*==\\s*");
        leftOperands = parts[0].split("\\s*\\+\\s*");
        rightOperand = parts[1];

        Set<Character> unique = new HashSet<>();
        leadingLetters = new HashSet<>();

        for (String operand : leftOperands)
        {
            leadingLetters.add( operand.charAt(0) );
            for (char c : operand.toCharArray())
                unique.add(c);
        }

        leadingLetters.add( rightOperand.charAt(0) );
        for (char c : rightOperand.toCharArray())
            unique.add(c);

        letters = new ArrayList<>(unique);
    }

    Map<Character, Integer> backtrack(int index, List<Character> remainingLetters)
    {
        if (index == remainingLetters.size())
        {
            if (isValid())
            {
                return new HashMap<>(assigned);
            }
            return null;
        }



        Character c = remainingLetters.get(index);
        int start = leadingLetters.contains(c) ? 1 : 0;

        for (int digit = start; digit <= 9; ++digit)
        {
            if (!usedDigits.contains(digit))
            {
                assigned.put(c, digit);
                usedDigits.add(digit);

                Map<Character, Integer> result = backtrack(index + 1, remainingLetters);
                if (result != null)
                {
                    return result;
                }

                assigned.remove(c);
                usedDigits.remove(digit);
            }
        }
        return null;
    }

    private boolean isValid()
    {
        long sum = 0;
        for (String operand : leftOperands)
        {
            sum += wordToNumber(operand);
        }
        return sum == wordToNumber(rightOperand);
    }

    private long wordToNumber(String word)
    {
        long num = 0;
        for (char c : word.toCharArray())
        {
            num = num * 10 + assigned.get(c);
        }
        return num;
    }

}




















