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

        AffineCipherTest test = new AffineCipherTest();
        test.testEncodeYes();
        test.testEncodeNo();
        test.testEncodeOMG();
        test.testEncodeO_M_G();
        test.testEncodeMindBlowingly();
        test.testEncodeNumbers();
        test.testEncodeDeepThought();
        test.testEncodeAllTheLetters();
        test.testEncodeThrowsMeaningfulException();
        test.testDecodeExercism();
        test.testDecodeSentence();
        test.testDecodeNumbers();
        test.testDecodeAllTheLetters();
        test.testDecodeWithNoSpaces();
        test.testDecodeWithTooManySpaces();
        test.testDecodeThrowsMeaningfulException();

    }
}