
package bank1;


public class Revisar {
    private String name;
    private int balance;
    private String id;
    private double interestRate;
    
    public Revisar(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
    }
    
    public void setBalance(int newBalance){
        this.balance = newBalance;
    }
    public int getBalance(){
        return this.balance;
    }
    public double getMonthlyInterest (){
        return this.interestRate * this.balance;
    }
}