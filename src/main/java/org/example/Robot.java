package org.example;

import java.util.UUID;
import java.util.Set;
import java.util.HashSet;

public class Robot {

    private static final Set<String> usedNames = new HashSet<>();

    String name = "";

    String getName() {
        if (name.isEmpty())
            reset();
        return name;
    }

    void reset() {
        do
        {
            UUID uuid = UUID.randomUUID();
            int hash = uuid.hashCode();

            char a = (char) ('A' + Math.abs((hash >> 8) % 26));
            char b = (char) ('A' + Math.abs((hash >> 4) % 26));

            int num = Math.abs(hash % 1000);

            name = String.format("%c%c%03d", a, b, num);
        }
        while (!usedNames.add(name));
    }

}
