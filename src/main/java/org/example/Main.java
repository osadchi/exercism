package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BaseConverterTest test = new BaseConverterTest();
        test.testSingleBitOneToDecimal();
        test.testBinaryToSingleDecimal();
        test.testSingleDecimalToBinary();
        test.testBinaryToMultipleDecimal();
        test.testDecimalToBinary();
        test.testTrinaryToHexadecimal();
        test.testHexadecimalToTrinary();
        test.test15BitInteger();
        test.testEmptyDigits();
        test.testSingleZero();
        test.testMultipleZeros();
        test.testLeadingZeros();
        test.testFirstBaseIsOne();
        test.testFirstBaseIsZero();
        test.testFirstBaseIsNegative();
        test.testNegativeDigit();
        test.testInvalidPositiveDigit();
        test.testSecondBaseIsOne();
        test.testSecondBaseIsZero();
        test.testSecondBaseIsNegative();

    }
}