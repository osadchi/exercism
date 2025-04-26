package org.example;

import java.util.List;
import java.util.ArrayList;

class PigLatinTranslator {
    public String translate(String word) {
        //        a e i o u y
        Character[] sogl = {'a', 'e', 'i', 'o', 'u'};
        String result = "";
        List<String> words = new ArrayList<>();
        String sub = "";
        for (int i = 0; i < word.length(); ++i)
        {
            Character c = word.charAt(i);
            if (Character.isSpaceChar(c) && !sub.isEmpty())
            {
                words.add(sub);
                sub = "";
            }
            else if (i + 1 == word.length())
            {
                sub += c;
                words.add(sub);
            }
            else
            {
                sub += c;
            }
        }
        for (String sword : words)
        {
            boolean isFirstSogl = false;
            boolean isYForcedToBeVowel = true;
            Character firstLetter = sword.charAt(0);
            if (firstLetter.equals('y'))
                isYForcedToBeVowel = false;
            String firstTwo = sword.substring(0, 2);

            for (Character c : sogl)
            {
                if (c.equals(firstLetter))
                {
                    isFirstSogl = true;
                    break;
                }
            }
            if (isFirstSogl || firstTwo.equals("xr") || firstTwo.equals("yt"))
            {
                result += (result.length() > 0 ? " " : "") + sword + "ay";
            }
            else
            {
                String notSoglPart = "";
                Character beforeTheLastOne = ' ';
                notSoglLoop:
                for (Character c : sword.toCharArray())
                {
                    for (Character s : sogl)
                    {
                        if (c.equals(s) && !c.equals('u') && !c.equals('y') || c.equals('u') && !beforeTheLastOne.equals('q') || c.equals('y') && (sword.length() >= notSoglPart.length()+2 && sword.substring(notSoglPart.length()+1, notSoglPart.length()+2).equals("t") || isYForcedToBeVowel))
                            break notSoglLoop;
                    }
                    notSoglPart += c;
                    beforeTheLastOne = c;
                }
                System.out.println(notSoglPart);
                result += (result.length() > 0 ? " " : "") + sword.substring(notSoglPart.length()) + notSoglPart + "ay";
            }
        }
        return result;
    }

}
