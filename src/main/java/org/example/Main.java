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

        BottleSongTest test = new BottleSongTest();
        test.setup();
        test.firstGenericVerse();
        test.setup();
        test.lastGenericVerse();
        test.setup();
        test.verseWithTwoBottles();
        test.setup();
        test.verseWithOneBottle();
        test.setup();
        test.firstTwoVerses();
        test.setup();
        test.lastThreeVerses();
        test.setup();
        test.allVerses();




    }
}