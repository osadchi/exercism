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

        BinarySearchTest test = new BinarySearchTest();
        try
        {
            test.findsAValueInAnArrayWithOneElement();
        }
        catch (ValueNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        test.identifiesThatAValueIsNotFoundInTheArray();
        test.aValueSmallerThanTheArraysSmallestValueIsNotFound();
        try
        {
            test.findsAValueInTheMiddleOfAnArray();
        }
        catch (ValueNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            test.findsAValueAtTheBeginningOfAnArray();
        }
        catch (ValueNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            test.findsAValueAtTheEndOfAnArray();
        }
        catch (ValueNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            test.findsAValueInAnArrayOfOddLength();
        }
        catch (ValueNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            test.findsAValueInAnArrayOfEvenLength();
        }
        catch (ValueNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            test.aValueLargerThanTheArraysLargestValueIsNotFound();
        }
        catch (ValueNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            test.nothingIsFoundInAnEmptyArray();
        }
        catch (ValueNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            test.nothingIsFoundWhenTheLeftAndRightBoundCross();
        }
        catch (ValueNotFoundException e)
        {
            System.out.println(e.getMessage());
        }




    }
}