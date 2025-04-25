package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        PhoneNumberTest test = new PhoneNumberTest();
        test.cleansNumbersWithMultipleSpaces();
        test.cleansNumbersWithDots();
        test.cleansTheNumber();
        test.invalidIfAreaCodeStartsWith0();
        test.invalidIfAreaCodeStartsWith0OnValid11DigitNumber();
        test.invalidIfAreaCodeStartsWith1();
        test.invalidIfAreaCodeStartsWith1OnValid11DigitNumber();
        test.invalidIfExchangeCodeStartsWith0();
        test.invalidIfExchangeCodeStartsWith0OnValid11DigitNumber();
        test.invalidIfExchangeCodeStartsWith1();
        test.invalidIfExchangeCodeStartsWith1OnValid11DigitNumber();
        test.invalidWhen9Digits();
        test.invalidWhen11DigitsDoesNotStartWith1();
        test.invalidWhenMoreThan11Digits();
        test.invalidWithLetters();
        test.invalidWithPunctuations();
        test.validWhen11DigitsAndStartingWith1();
        test.validWhen11DigitsAndStartingWith1EvenWithPunctuation();

    }
}