/*
 * Simple banking project 
 * Asmita Karn 
 * 
 */

/**
 *
 * This class perform various operations performed within the bank.
 */
import java.io.*; //needed for all input output package
public class BankOperation { // building BankOperation class

    double balance;
    
    //balanceCheck() method to check the balance in the account.
    public double balanceCheck() {
        return balance;
    }
    
    //deposit() method to deposit balance in the acoount.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    //withdrawl() method to withdrawl balance from the acoount.
    public void withdrawl(double amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }
    
    ////simpleInterest() method to calculate simple interest.
    public double simpleInterest(int year, double interestRate) {
        double SI = (balance*interestRate*year)/100;
        return SI;
        
    }
}
