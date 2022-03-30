
package chapter11_08;

import java.util.Date;


public class Transaction {
    
    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;                                            //holds the values
    private String description;
    
    public Transaction(char type, double amount, double balance, String description){
        date = new java.util.Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;                                                 //gets specfic values
        this.description = description;
        
    }

    public void setDate(Date date) {
        this.date = date;                                                   //setter getter method
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }
    
}
