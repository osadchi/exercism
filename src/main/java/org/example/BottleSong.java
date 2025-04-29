package org.example;

public class BottleSong {
    String recite(int startBottles, int takeDown) {
        String result = "";

        for (; takeDown > 0; --takeDown, --startBottles)
        {
            if (!result.isEmpty())
            {
                result += "\n";
            }

            int sum = startBottles - 1;
            String sStartBottles = stringify(startBottles, true);
            String sSum = stringify(sum);

            result += sStartBottles + " green bottle" + (startBottles > 1 ? "s" : "") + " hanging on the wall,\n" +
                    sStartBottles + " green bottle" + (startBottles > 1 ? "s" : "") + " hanging on the wall,\n" +
                    "And if one green bottle should accidentally fall,\n" +
                    "There'll be " + sSum + " green bottle" + (sum == 0 || sum > 1 ? "s" : "") + " hanging on the wall.\n";

        }

        return result;
    }

    String stringify(int i, boolean capital)
    {
        String result;
        switch (i)
        {
            case 0:
                result = "no";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            case 10:
                result = "ten";
                break;
            default:
                throw new IllegalArgumentException();
        }
        if (capital)
        {
            result = result.substring(0, 1).toUpperCase() + result.substring(1);
        }
        return result;
    }

    String stringify(int i)
    {
        return stringify(i, false);
    }
}
