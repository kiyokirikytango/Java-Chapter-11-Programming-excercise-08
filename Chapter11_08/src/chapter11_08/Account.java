/*
Chapter 11 Programming excercise 08
Riky Hernandez
10/11/21
Description: Design a class named Transaction. Program with annual intrest rate of 1.5%, balance 1000 id 1122 name George
                Deposit 30 40 50 Withdraw 5 4 2,Print account summary, name n inrest rate balance, all transcations
         _..._
      .'     '.      _
     /    .-""-\   _/ \
   .-|   /:.   |  |   |
   |  \  |:.   /.-'-./
   | .-'-;:__.'    =/
   .'=  *=|NASA _.='
  /   _.  |    ;
 ;-.-'|    \   |
/   | \    _\  _\
\__/'._;.  ==' ==\
         \    \   |
         /    /   /
         /-._/-._/
         \   `\  \
          `-._/._/
*/
package chapter11_08;

import java.util.ArrayList;


public class Account {
    
    private int id;
    private double balance;
    private static double annualIntrestRate;         //holds the values
    private java.util.Date dateCreated;
    private String name;
    java.util.ArrayList transactions = new java.util.ArrayList();
    
    public Account(){
        dateCreated = new java.util.Date();
    }
    
    public Account(int newId, double newBalance){
        id = newId;
        balance = newBalance;
        dateCreated = new java.util.Date();
    }
                                                                                           //gets specfic values
    public Account(int newId, double newBalance, double newAnnualIntrestRate, String name){
        id = newId;
        balance = newBalance;
        this.name = name;
        dateCreated = new java.util.Date();
        this.annualIntrestRate = newAnnualIntrestRate;
    }
    
    public int getId(){                                         //setter getter methods
        return this.id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public static double getAnnualIntrestRate(){
        return annualIntrestRate;
    }
    
    public void setId(int newId){
        id = newId;
    }
    
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    
    public static void setAnnualIntrestRate(double newAnnualIntrestRate){
        annualIntrestRate =  newAnnualIntrestRate;
    }
    
    public double getMonthlyIntrest(){
        return balance * (annualIntrestRate / 1200);
    }
    
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    
    public void withdraw(double amount){
        balance -= amount;                                                  //adding the transcation class
        transactions.add(new Transaction('W', amount , balance, ""));
    }
    
    public void deposit(double amount){
        balance += amount;                                                  //adding the transcation class
        transactions.add(new Transaction('D', amount , balance, ""));
    }
    
    public static void main (String[] args){                            
        Account acc = new Account (1122, 1000, 1.5,"George");               //new constructor with new id,balance, interest rate, name
        acc.deposit(30);
        acc.deposit(40);                                    
        acc.deposit(50);
        
        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(2);
                                                                                                                
        System.out.println("Name: " + acc.getName());
        System.out.println("ID: " + acc.id);
        System.out.println("Annual Interest Rate: " + acc.getAnnualIntrestRate());
        System.out.println("Balance: " + acc.getBalance());
        
        System.out.printf("%-35s%-15s%-15s%-15s\n", "Date", "Type", "Amount","Balance" );       //format to make it look like a table
        
        java.util.ArrayList list = acc.getTransactions();                                               
                                                                                                    //gettin info from Trancsaction class
        for (int i = 0; i < list.size();i++){                                   
            Transaction t = (Transaction) list.get(i);
            System.out.printf("%-35s%-15s%-15s%-15s\n", t.getDate(),t.getType(),t.getAmount(),t.getBalance());
        }
        
    }
                                                                                    //setter getter methods
    public String getName() {
        return name;
    }

    public ArrayList getTransactions() {
        return transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransactions(ArrayList transactions) {
        this.transactions = transactions;
    }
    
}
