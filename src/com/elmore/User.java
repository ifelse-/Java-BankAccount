package com.elmore;

public class User {

    private int accountNumber;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

   /*
    public User(){
         this(90574, "Marvin", "marvin@test.com", "(555)-555-555");
    }
   */

    public User(int accountNumber, String customerName, String emailAddress, String phoneNumber){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }


    //Setter
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }


    //Getter
    public int getAccountNumber(){
        return  accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

}