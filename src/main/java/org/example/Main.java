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

        BankAccountTest test = new BankAccountTest();
        test.setUp();
        try
        {
            test.newlyOpenedAccountHasEmptyBalance();
        }
        catch (BankAccountActionInvalidException e)
        {
            System.out.println(e.getMessage());
        }
        test.setUp();
        try
        {
            test.singleDeposit();
        }
        catch (BankAccountActionInvalidException e)
        {
            System.out.println(e.getMessage());
        }
        test.setUp();
        try
        {
            test.multipleDeposits();
        }
        catch (BankAccountActionInvalidException e)
        {
            System.out.println(e.getMessage());
        }
        test.setUp();
        try
        {
            test.withdrawOnce();
        }
        catch (BankAccountActionInvalidException e)
        {
            System.out.println(e.getMessage());
        }
        test.setUp();
        try
        {
            test.withdrawTwice();
        }
        catch (BankAccountActionInvalidException e)
        {
            System.out.println(e.getMessage());
        }
        test.setUp();
        try
        {
            test.canDoMultipleOperationsSequentially();
        }
        catch (BankAccountActionInvalidException e)
        {
            System.out.println(e.getMessage());
        }
        test.setUp();
        try
        {
            test.cannotCheckBalanceOfClosedAccount();
        }
        catch (BankAccountActionInvalidException e)
        {
            System.out.println(e.getMessage());
        }
        test.setUp();
        try
        {
            test.cannotDepositIntoClosedAccount();
        }
        catch (BankAccountActionInvalidException e)
        {
            System.out.println(e.getMessage());
        }
        test.setUp();
        test.cannotDepositIntoUnopenedAccount();
        test.setUp();
        try
        {
            test.cannotWithdrawFromClosedAccount();
        }
        catch (BankAccountActionInvalidException e)
        {
            System.out.println(e.getMessage());
        }
        test.setUp();
        test.cannotCloseAnAccountThatWasNotOpened();
        test.setUp();
        try
        {
            test.cannotOpenAnAlreadyOpenedAccount();
        }
        catch (BankAccountActionInvalidException e)
        {
            System.out.println(e.getMessage());
        }
        test.setUp();
        try
        {
            test.reopenedAccountDoesNotRetainBalance();
        }
        catch (BankAccountActionInvalidException e)
        {
            System.out.println(e.getMessage());
        }
        test.setUp();
        try
        {
            test.cannotWithdrawMoreThanWasDeposited();
        }
        catch (BankAccountActionInvalidException e)
        {
            System.out.println(e.getMessage());
        }
        test.setUp();
        try
        {
            test.cannotWithdrawNegativeAmount();
        }
        catch (BankAccountActionInvalidException e)
        {
            System.out.println(e.getMessage());
        }
        test.setUp();
        try
        {
            test.cannotDepositNegativeAmount();
        }
        catch (BankAccountActionInvalidException e)
        {
            System.out.println(e.getMessage());
        }
        test.setUp();
        try
        {
            test.canHandleConcurrentTransactions();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }





    }
}