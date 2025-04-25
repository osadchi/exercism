package org.example;

class PhoneNumber {

    String number = "";

    PhoneNumber(String numberString) {

        boolean isCodeAreaStarted = false;
        boolean isExchangeAreaStarted = false;

        for (Character c : numberString.toCharArray())
        {
            if (number.length() == 4 && c.equals('1'))
            {
                throw new IllegalArgumentException("exchange code cannot start with one");
            }
            else if (number.length() == 0 && c.equals('0'))
            {
                throw new IllegalArgumentException("area code cannot start with zero");
            }
            else if (number.length() == 1 && c.equals('0'))
            {
                throw new IllegalArgumentException("area code cannot start with zero");
            }
            else if (isCodeAreaStarted && c.equals('1'))
            {
                throw new IllegalArgumentException("area code cannot start with one");
            }
            else if (isExchangeAreaStarted && c.equals('0'))
            {
                throw new IllegalArgumentException("exchange code cannot start with zero");
            }
            else if (isExchangeAreaStarted && c.equals('1'))
            {
                throw new IllegalArgumentException("exchange code cannot start with one");
            }
            else if (c.equals('('))
            {
                isCodeAreaStarted = true;
            }
            else if (c.equals(')'))
            {
                isExchangeAreaStarted = true;
            }
            else if (Character.isDigit(c))
            {
                isCodeAreaStarted = false;
                isExchangeAreaStarted = false;
                number += "" + c;
            }
            else if (Character.isAlphabetic(c))
            {
                throw new IllegalArgumentException("letters not permitted");
            }
            else if (!Character.isSpaceChar(c) && !c.equals('.') && !c.equals('-') && !c.equals('+'))
            {
                throw new IllegalArgumentException("punctuations not permitted");
            }
        }

        if (number.length() < 10)
            throw new IllegalArgumentException("must not be fewer than 10 digits");
        else if (number.length() == 11 && number.toCharArray()[0] != '1')
            throw new IllegalArgumentException("11 digits must start with 1");
        else if (number.length() > 11)
            throw new IllegalArgumentException("must not be greater than 11 digits");


    }

    String getNumber() {
        if (number.toCharArray()[0] == '1')
            number = number.substring(1);
        return number;
    }

}