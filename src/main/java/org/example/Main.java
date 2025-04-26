package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

        PrimeFactorsCalculatorTest test = new PrimeFactorsCalculatorTest();
        test.setUp();
        test.testNoFactors();
        test.testPrimeNumber();
        test.testAnotherPrimeNumber();
        test.testSquareOfAPrime();
        test.testProductOfFirstPrime();
        test.testCubeOfAPrime();
        test.testProductOfSecondPrime();
        test.testProductOfThirdPrime();
        test.testProductOfFirstAndSecondPrime();
        test.testProductOfPrimesAndNonPrimes();
        test.testProductOfPrimes();
        test.testFactorsIncludingALargePrime();

    }
}