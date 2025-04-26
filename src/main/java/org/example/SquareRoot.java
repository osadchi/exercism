package org.example;

public class SquareRoot {
    public int squareRoot(int radicand) {
        double r = 1.0 * radicand;
        double guess = r;
        double prev;

        do
        {
            prev = guess;
            guess = (0.5 * (guess + r / guess));
        }
        while ((int) (prev) > (int) (guess));

        return (int) guess;
    }
}
