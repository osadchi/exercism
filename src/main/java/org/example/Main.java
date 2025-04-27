package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.Map.entry;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AlphameticsTest test = new AlphameticsTest();
        try
        {
            test.testThreeLetters();
            test.testUniqueValue();
            test.testLeadingZero();
            test.testTwoDigitsFinalCarry();
            test.testFourLetters();
            test.testSixLetters();
            test.testSevenLetters();
            test.testEightLetters();
            test.testTenLetters();
            test.testTenLetters41Addends();
        }
        catch (UnsolvablePuzzleException e)
        {
            System.out.println("Unsolved");
        }

    }
}