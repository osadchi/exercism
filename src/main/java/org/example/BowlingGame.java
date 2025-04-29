package org.example;

import java.util.List;
import java.util.ArrayList;

class BowlingGame {

    List<Integer> rolls = new ArrayList<>();

    void roll(int pins) {
        if (pins < 0)
        {
            rolls.clear();
            throw new IllegalStateException("Negative roll is invalid");
        }
        else if (pins > 10)
        {
            rolls.clear();
            throw new IllegalStateException("Pin count exceeds pins on the lane");
        }
        else if (rolls.size() % 2 > 0 && rolls.get( rolls.size()-1 ) < 10 && rolls.get( rolls.size()-1 ) + pins > 10)
        {
            rolls.clear();
            throw new IllegalStateException("Pin count exceeds pins on the lane");
        }
        else if (rolls.size() > 0 && rolls.size() % 2 == 0 && rolls.get( rolls.size()-2 ) == 10 && rolls.get( rolls.size()-1 ) + pins > 10 && rolls.get( rolls.size()-1 ) < 10)
        {
            System.out.println(rolls.get( rolls.size()-2 ) + " " + rolls.get( rolls.size()-1 ) + " " + pins);
            rolls.clear();
            throw new IllegalStateException("Pin count exceeds pins on the lane");
        }
        else if (rolls.size()+1 > 20 && rolls.get(18) != 10 && rolls.get(19) != 10 && pins != 10 && rolls.get(18) + rolls.get(19) < 10)
        {
            System.out.println(rolls.get(18) + " " + rolls.get(19) + " " + pins);
            rolls.clear();
            throw new IllegalStateException("Cannot roll after game is over");
        }
        else if (rolls.size()+1 == 22 && rolls.get(19) != 10)
        {
            rolls.clear();
            throw new IllegalStateException("Cannot roll after game is over");
        }
        rolls.add(pins);
    }

    int score() {
        if (rolls.size() == 0)
        {
            throw new IllegalStateException("Score cannot be taken until the end of the game");
        }

        List<Integer> pins = new ArrayList<>(rolls);
        rolls.clear();

        int allowedShots = 20;
        int points = 0;

        boolean isGameComplete = false;
        for (int i = 0; i < pins.size() && i < allowedShots; i += 2)
        {
            if (i + 1 >= pins.size())
            {
                break;
            }
            int a = pins.get(i);
            int b = pins.get(i + 1);
            int c = (i + 2 < pins.size() ? pins.get(i + 2) : 0);
            int d = (i + 3 < pins.size() ? pins.get(i + 3) : 0);
            points += framePoints(a, b, c, d, isSpare(a, b), isStrike(a, b));

            if (i + 2 >= allowedShots)
            {
                isGameComplete = true;
            }
            if (isStrike(a, b))
            {
                --i;
                --allowedShots;
                if (c == 0)
                    isGameComplete = false;
            }
            else if (isSpare(a, b))
            {
                allowedShots -= 2;
                if (c == 0)
                    isGameComplete = false;
            }




            System.out.println(allowedShots + " " + i + ": " +  a + " + " + b + " = " + framePoints(a, b, c, d, isSpare(a, b), isStrike(a, b)) + " === " + points);
        }

        if (!isGameComplete)
        {
            throw new IllegalStateException("Score cannot be taken until the end of the game");
        }

        return points;
    }

    boolean isSpare(int a, int b)
    {
        if (a != 10 && b != 10 && a + b == 10)
        {
            return true;
        }
        return false;
    }

    boolean isStrike(int a, int b)
    {
        return (a == 10 || b == 10 ? true : false);
    }

    int framePoints(int a, int b, int c, int d, boolean isSpare, boolean isStrike)
    {
        int points = 0;
        if (isStrike(a, b))
        {
            points = 10 + b + c + (a == 0 ? d : 0);
        }
        else if (isSpare(a, b))
        {
            points = 10 + c;
        }
        else
        {
            points = a + b;
        }
        return points;
    }

    int framePoints(int a, int b, int c, int d, boolean isSpare)
    {
        return framePoints(a, b, c, d, isSpare, false);
    }

    int framePoints(int a, int b, int c, int d)
    {
        return framePoints(a, b, c, d, false, false);
    }

    int framePoints(int a, int b, int c)
    {
        return framePoints(a, b, c, 0, false, false);
    }

    int framePoints(int a, int b)
    {
        return framePoints(a, b, 0, 0, false, false);
    }

}
