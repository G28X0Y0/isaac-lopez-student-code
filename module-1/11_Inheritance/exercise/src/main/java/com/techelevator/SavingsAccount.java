package com.techelevator;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int ammountToWithdraw){
        if(getBalance() - ammountToWithdraw < 150 && getBalance() - ammountToWithdraw > 1){
            ammountToWithdraw += 2;
        }
        else if(getBalance() - ammountToWithdraw - 2 <= 1){
            ammountToWithdraw = 0;
        }
        else if(getBalance() - ammountToWithdraw < 0){
            ammountToWithdraw = 0;
        }

        return super.withdraw(ammountToWithdraw);
    }

}
