package com.xworks.bank.current;

import com.xworks.bank.bankaccount.BankAccount;
// child    / sub  / derived
public class CurrentAccount extends BankAccount {
public CurrentAccount(){
    super();
    System.out.println(" current account invoked");
}

public CurrentAccount(double minBalance){
    this.credit(minBalance);
}

}
