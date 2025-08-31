package com.xworks.bank.bankaccount;

//parent /super / base
public class BankAccount {

          public double balance;
             public double getBalance(){
                 return balance;
             }
          public   void  debit(double amount){
            balance = balance - amount;
            }
          public void credit(double amount){
                 balance = balance + amount;
          }

      public void transfer(BankAccount beneficiaryAccount , double amount){
             this.debit(amount);
             beneficiaryAccount.credit(amount);
          }
}

