package com.xworks.bank;

import com.xworks.bank.bankaccount.BankAccount;
import com.xworks.bank.current.CurrentAccount;
import com.xworks.bank.savings.SavingAccount;

public class BankRunner {
    public static void main(String[] args) {
        System.out.println("main stsrted");

        BankAccount chinAccount =new BankAccount();
        chinAccount.credit(50000);
        chinAccount.getBalance();

       /* BankAccount friendAccount =new BankAccount();
        chinAccount.transfer(friendAccount,200);

        BankAccount pappaAccount = new BankAccount();
        friendAccount.transfer(pappaAccount,100);

        BankAccount mammaAccount = new BankAccount();
        pappaAccount.transfer(chinAccount,50);
        SavingAccount mommaccount = new SavingAccount();
        chinAccount.transfer(mommaccount,1000);
        SavingAccount daddyaccount = new SavingAccount();
        chinAccount.transfer(daddyaccount,500);
        SavingAccount broaccount = new SavingAccount();
        chinAccount.transfer(broaccount,100);
        SavingAccount sisaccount = new SavingAccount();
        chinAccount.transfer(sisaccount,90);
        SavingAccount frndaccount = new SavingAccount();
        chinAccount.transfer(frndaccount,200);
        SavingAccount bestfrndaccount = new SavingAccount();
        chinAccount.transfer(bestfrndaccount,100);
        SavingAccount uncleaccount = new SavingAccount();
        chinAccount.transfer(uncleaccount,78);
        SavingAccount auntyaccount = new SavingAccount();
        uncleaccount.transfer(auntyaccount,50);
        SavingAccount grannyaccount = new SavingAccount();
        daddyaccount.transfer(grannyaccount,100);*/




       /* System.out.println("the available balance in chin acc is : " + chinAccount.getBalance());
        BankAccount mammaSavingacc = new SavingAccount();
        chinAccount.transfer(mammaSavingacc,10000);
        System.out.println("the available balance in mamma acc is :  " + mammaSavingacc.getBalance());
        System.out.println("the available balance in chin acc is : " + chinAccount.getBalance());

        BankAccount daddySavingacc = new SavingAccount();
        chinAccount.transfer(daddySavingacc,1000);
        System.out.println("the available   balance in savingpappa acc is :  " + daddySavingacc.getBalance());
        System.out.println("the available balance in chin acc is : " + chinAccount.getBalance());

        BankAccount frndCurrentacc = new CurrentAccount();
        chinAccount.transfer(frndCurrentacc,500);
        System.out.println("the available balance in currentacc  frnd acc is :  " + frndCurrentacc.getBalance());
        System.out.println("the available balance in chin acc is : " + chinAccount.getBalance());

        BankAccount uncleCurrentacc = new CurrentAccount();
        chinAccount.transfer(uncleCurrentacc,5000);
        System.out.println("the available balance in uncle acc is :  " + uncleCurrentacc.getBalance());
        System.out.println("the available balance in chin acc is : " + chinAccount.getBalance());

        BankAccount auntSavingacc = new SavingAccount();
        chinAccount.transfer(auntSavingacc,400);
        System.out.println("the available balance in aunt acc is :  " + auntSavingacc.getBalance());
        System.out.println("the available balance in chin acc is : " + chinAccount.getBalance());


        BankAccount grannnySavingacc = new SavingAccount();
        auntSavingacc.transfer(grannnySavingacc,300);
        System.out.println("the available balance in granny acc is :  " + grannnySavingacc.getBalance());
        System.out.println("the available balance in aunt acc is :  " + auntSavingacc.getBalance());

        BankAccount tattasCurrentacc = new CurrentAccount();
        daddySavingacc.transfer(tattasCurrentacc,550);
        System.out.println("tatts current acc balance is : "  + tattasCurrentacc.getBalance() );
        System.out.println("the available   balance in savingpappa acc is :  " + daddySavingacc.getBalance());


        BankAccount brpSavingacc = new SavingAccount();
        mammaSavingacc.transfer(brpSavingacc,755);
        System.out.println("the available balance in bro acc is :  " + brpSavingacc.getBalance());
        System.out.println("the available balance in mamma acc is :  " + mammaSavingacc.getBalance());

        BankAccount sisCurrenacc = new CurrentAccount();
        grannnySavingacc.transfer(sisCurrenacc,100);
        System.out.println("the available balance in bestfrnd acc is :  " + sisCurrenacc.getBalance());
        System.out.println("the available balance in granny acc is :  " + grannnySavingacc.getBalance());

        BankAccount bestfrnfSavingacc = new SavingAccount();
        frndCurrentacc.transfer(bestfrnfSavingacc,200);
        System.out.println("the available balance in bestfrnd acc is :  " + bestfrnfSavingacc.getBalance());
        System.out.println("the available balance in currentacc  frnd acc is :  " + frndCurrentacc.getBalance());


        System.out.println("the available balance in chin acc is : " + chinAccount.getBalance());*/
        SavingAccount savingAccount1 = new SavingAccount();
        CurrentAccount currentAccount = new CurrentAccount(1000.0);
        SavingAccount savingAccount = new SavingAccount(500);

        System.out.println("Balance : " + savingAccount1.getBalance());
        System.out.println("the  current acc with min balance  : " + currentAccount.getBalance());
        System.out.println("the min balance : " + savingAccount.getBalance());


        System.out.println("main ended");
    }
}
