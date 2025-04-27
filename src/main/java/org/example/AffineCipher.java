package org.example;

import java.math.BigInteger;

public class AffineCipher {

    final static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public String encode(String text, int coefficient1, int coefficient2){
        if (BigInteger.valueOf(coefficient1).gcd(BigInteger.valueOf(26)).intValue() != 1)
        {
            throw new IllegalArgumentException("Error: keyA and alphabet size must be coprime.");
        }
        String result = "";
        int spacedout = 0;
        for (Character c : text.toLowerCase().toCharArray())
        {
            if (Character.isAlphabetic(c))
            {
                for (int i = 0; i < alphabet.length(); ++i)
                {
                    if (c.equals(alphabet.charAt(i)))
                    {
                        if (result.length() > 0 && (result.length() - spacedout) % 5 == 0)
                        {
                            ++spacedout;
                            result += " ";
                        }
                        result += "" + alphabet.charAt((coefficient1*i + coefficient2) % 26);
                    }
                }
            }
            else if (Character.isDigit(c))
            {
                result += c;
            }
        }
        return result;
    }

    public String decode(String text, int coefficient1, int coefficient2){

        if (BigInteger.valueOf(coefficient1).gcd(BigInteger.valueOf(26)).intValue() != 1)
        {
            throw new IllegalArgumentException("Error: keyA and alphabet size must be coprime.");
        }
        String result = "";


        int inverse = 1;
        int tempCoefficient = 0;
        int modulus = 26;
        while (coefficient1 > 1)
        {
            int quotient = coefficient1 / modulus;
            int temp = modulus;
            modulus = coefficient1 % modulus;
            coefficient1 = temp;

            temp = tempCoefficient;
            tempCoefficient = inverse - quotient * tempCoefficient;
            inverse = temp;
        }
        if (inverse < 0)
        {
            inverse += 26;
        }

        for (Character c : text.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(c)) {
                for (int i = 0; i < alphabet.length(); ++i) {
                    if (c.equals(alphabet.charAt(i))) {
                        System.out.println(i + " == " + (int)(inverse * (i - coefficient2 + 26) % 26) + " ===> " + inverse + " * " + ((i - coefficient2)%26 + 26) + " = " + inverse * Math.abs(i - coefficient2 + 26));
                        result += "" + alphabet.charAt(
                                (int)(inverse * ((i - coefficient2)%26 + 26) % 26)
                        );
                    }
                }
            }
            else if (Character.isDigit(c))
            {
                result += c;
            }
        }
        return result;
    }
}
