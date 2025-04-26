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

        WordCountTest test = new WordCountTest();
        test.setup();
        test.countOneWord();
        test.countOneOfEachWord();
        test.multipleOccurrencesOfAWord();
        test.handlesCrampedLists();
        test.handlesExpandedLists();
        test.ignorePunctuation();
        test.includeNumbers();
        test.normalizeCase();
        test.withApostrophes();
        test.substringsFromTheBeginning();
        test.withQuotations();
        test.multipleSpacesNotDetectedAsAWord();
        test.alternatingWordSeperatorsNotDetectedAsAWord();
        test.quotationForWordWithApostrophe();

    }
}