package com.techelevator;

public class CreditCardAccount implements Accountable{

    private String accountHolder;
    private String AccountNumber;
    private int debt;

    public CreditCardAccount(String accountHolder, String getAccountNumber) {
        this.accountHolder = accountHolder;
        this.AccountNumber = getAccountNumber;
        this.debt = 0;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public int getDebt() {
        return debt;
    }

    public int pay(int amountToPay){
        debt -= amountToPay;
        return debt;
    }

    public int charge(int amountToCharge){
        debt += amountToCharge;
        return debt;
    }

    @Override
    public int getBalance() {
        return -debt;
    }
}
