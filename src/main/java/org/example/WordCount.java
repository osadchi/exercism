package org.example;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class WordCount {



    public Map<String, Integer> phrase(String input) {
        List<String> words = new ArrayList<>();
        String regex = "\\b[\\d\\p{L}'-]+\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find())
        {
            words.add(matcher.group().toLowerCase());
        }

        System.out.println(words);

        Map<String, Integer> map = new HashMap<>();
        Set<String> set = words.stream().collect(Collectors.toSet());
        for (String word : set)
        {
            int count = Collections.frequency(words, word);
            map.put(word, ( map.containsKey(word) ? map.get(word) + count : count ));
            words.removeIf(w -> w.equals(word));
        }
        return map;


    }
}
