package TP04;

public class SavvingAccount extends BankAccount {
    private float interestRate;
    public SavvingAccount(float interestRate, double soldeIni){
        super(soldeIni);
        this.interestRate = interestRate;
    }
    public void  addPeriodicInterest(){
        float interet = (float) (super.getBalance() * interestRate);
        super.deposer(interet + super.getBalance());
    }
    
    
} 
