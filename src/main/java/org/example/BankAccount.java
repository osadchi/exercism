package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {

    private final Lock lock = new ReentrantLock();
    int balance = 0;
    boolean isClosed = true;

    void open() throws BankAccountActionInvalidException {
        if (!isClosed)
        {
            throw new BankAccountActionInvalidException("Account already open");
        }
        balance = 0;
        isClosed = false;
    }

    void close() throws BankAccountActionInvalidException {
        if (isClosed)
        {
            throw new BankAccountActionInvalidException("Account not open");
        }
        isClosed = true;
    }

    synchronized int getBalance() throws BankAccountActionInvalidException {
        if (isClosed)
        {
            throw new BankAccountActionInvalidException("Account closed");
        }
        int localBalance = 0;
        lock.lock();
        try
        {
            localBalance = balance;
        }
        finally {
            lock.unlock();
        }
        return localBalance;
    }

    synchronized void deposit(int amount) throws BankAccountActionInvalidException {
        if (isClosed)
        {
            throw new BankAccountActionInvalidException("Account closed");
        }
        lock.lock();
        try
        {
            if (amount < 0)
            {
                throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
            }
            balance += amount;
        }
        finally {
            lock.unlock();
        }
    }

    synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
        if (isClosed)
        {
            throw new BankAccountActionInvalidException("Account closed");
        }
        lock.lock();
        try
        {
            if (balance < amount)
            {
                throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
            }
            if (amount < 0)
            {
                throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
            }
            balance -= amount;
        }
        finally {
            lock.unlock();
        }
    }

}
