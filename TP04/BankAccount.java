 package TP04;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class BankAccount {
    private  double balance;
    private int account_id;
    private static int nextId = 0;
    private ArrayList<Operations> operations = new ArrayList<>();
    
    public BankAccount(){
        this.balance = (float) 0;
        nextId++;
        this.account_id = nextId;
    }
    public  BankAccount(double soldeIni){
        if(soldeIni <= 0){
            System.err.println("Erreur : solde ivalide");
        }
        else{
            this.balance = soldeIni;
            nextId++;
            this.account_id = nextId;
        }
        
    }

    public void deposer(double amount){
        if(amount < 0){
            System.err.println("Erreur : Solde invalid");
            return;
        }
        this.balance += amount;
        operations.add(new Operations("Deposit", amount, LocalDateTime.now()));
    }
    public void withdraw(double amount){
        if(amount < 0 || amount > this.balance){
            System.err.println("Erreur : Amount invalide");
            return;
        }
        this.balance -= amount;
        operations.add(new Operations("withdraw", amount, LocalDateTime.now()));
    }
    public  void transfert(BankAccount other, double amount){
        if(amount <= 0 || amount > this.balance){
            System.err.println("Erreur : Impossible de transferer");
            return;
        }
        if(this == other){
            System.err.println("Erreur : impossible de transfere a lui meme");
            return ;
        }
        
        other.deposer(amount);
        this.withdraw(amount);
        other.operations.remove(other.operations.size()-1);
        this.operations.remove(this.operations.size()-1);
        other.operations.add(new Operations("Recoit", amount, LocalDateTime.now()));
        this.operations.add(new Operations("Envoie", amount, LocalDateTime.now()));
    }
    public int getAccount_id() {
        return account_id;
    }
    public double getBalance() {
        return balance;
    }
    public ArrayList<Operations> getOperations() {
        return operations;
    }
    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setOperations(ArrayList<Operations> operations) {
        this.operations = operations;
    }
    
    @Override
    public String toString() {
        return "Num de compte : " + account_id + "\n" + "Balance : " + balance;
    }
}
