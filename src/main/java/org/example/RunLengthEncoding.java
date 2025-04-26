package org.example;

public class RunLengthEncoding {
    String encode(String data) {
        if (data.isEmpty())
            return data;
        Character currentLetter = data.charAt(0);
        int count = 1;
        String result = "";
        int processedLettersCount = 1;
        for (Character c : data.substring(1).toCharArray())
        {
            ++processedLettersCount;
            if (c.equals(currentLetter))
            {
                ++count;
            }
            else
            {
                result += "" + (count > 1 ? count : "") + currentLetter;
                count = 1;
                currentLetter = c;
            }

            if (processedLettersCount == data.length())
            {
                result += "" + (count > 1 ? count : "") + currentLetter;
            }
        }
        return result;
    }

    String decode(String data) {
        String result = "";
        int count = 0;
        Character characterAfterDigit = null;
        for (int i = 0; i < data.length(); ++i)
        {
            Character c = data.charAt(i);
            if (Character.isDigit(c))
            {
                count = Integer.parseInt(data.substring(i).replaceAll("^(\\d+).*", "$1"));
                i += String.valueOf(count).length();
                characterAfterDigit = data.charAt( i );
                for (int j = 0; j < count; ++j)
                {
                    result += "" + characterAfterDigit;
                }

            }
            else
            {
                result += "" + c;
            }
        }
        return result;
    }
}
