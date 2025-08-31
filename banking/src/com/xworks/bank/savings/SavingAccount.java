package com.xworks.bank.savings;

import com.xworks.bank.bankaccount.BankAccount;

 //child / sub / derived

public class SavingAccount extends BankAccount {


public SavingAccount(){

}



public SavingAccount(double minBalance) {
    this.credit(minBalance);
}
}
