package com.elmore;

public class BankAccount {

    private double checkingBalance = 0;
    private double savingBalance = 0;

    //Initialize Constructor
    public BankAccount() {
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
    }

    // Methods
    public void deposit(int amount, String account) {
        if(account == "checking"){
            this.checkingBalance += amount;
        }
        if(account == "saving"){
            this.savingBalance += amount;
        }
        System.out.println("You deposit " + amount + " inside your " + account +" account");

    }

    public void withdrawal(int amount, String account) {
        if(account == "checking"){
            if(amount > this.checkingBalance){
                System.out.println("Sorry, you have insufficient funds inside you "+ account +" ! You can't withdrawal " + amount);
                System.out.println("You have " + this.checkingBalance + " inside your checking account");
            } else {
                this.checkingBalance -= amount;
                System.out.println("You withdrawal " + amount);
                System.out.println("Current "+ account +" account balance " + this.checkingBalance);
            }
        }

        if(account == "saving"){
            if(amount > this.savingBalance){
                System.out.println("Sorry, you have insufficient funds inside you "+ account +" ! You can't withdrawal " + amount);
                System.out.println("You have " + this.savingBalance + " inside your checking account");
            } else {
                this.savingBalance -= amount;
                System.out.println("You withdrawal " + amount);
                System.out.println("Current "+ account +" account balance " + this.savingBalance);
            }
        }

    }


    // Setters
    public void setCheckingBalance(double balance) {
        this.checkingBalance = balance;
    }

    public void setSavingBalance(double balance){
        this.savingBalance = balance;
    }


    // Getters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingBalance(){
        return this.savingBalance;
    }

}