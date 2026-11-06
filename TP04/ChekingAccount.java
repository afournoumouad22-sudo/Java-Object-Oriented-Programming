package TP04;

public class ChekingAccount extends  BankAccount{
    static final int FREE_TRANSACTIONS = 3;
    static final float TRANSACTION_FEE = 0.5F;
    int transactionCount = 0;
    public ChekingAccount(double soldeIni){
        super(soldeIni);
        
    }
    @Override
    public void deposer(double amount) {
        super.deposer(amount);
        transactionCount++;
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        transactionCount++;
    }
    @Override
    public void transfert(BankAccount other, double amount) {
        super.transfert(other, amount);
        transactionCount++;
    }
    public  void deductFess(){
        if(transactionCount > FREE_TRANSACTIONS){
            int nbT = transactionCount - FREE_TRANSACTIONS;
            deposer((nbT * TRANSACTION_FEE));
            transactionCount = 0;
        }
    }
    
}
