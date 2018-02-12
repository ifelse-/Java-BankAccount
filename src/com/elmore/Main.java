package com.elmore;

public class Main {


    public static void main(String[] args) {

        BankAccount marvinAccount = new BankAccount();
        User marvinProfile = new User(90574, "Marvin", "marvin@test.com", "(555)-555-555");

        System.out.println("User Account number " + marvinProfile.getAccountNumber());

        marvinAccount.deposit(400, "checking");
        marvinAccount.deposit(300, "saving");
        marvinAccount.withdrawal(175, "checking");
        marvinAccount.deposit(250, "checking");
        marvinAccount.withdrawal(1175, "checking");

    }
}
