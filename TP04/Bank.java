package TP04;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();


    public BankAccount search(int num){
        for (BankAccount acc : accounts) {
            if(acc.getAccount_id() == num){
                return acc;
            }
        }
        System.err.println("n'existe pas");
        return null;
    }
    public void create(BankAccount account){
        if(accounts.contains(account)){
            System.err.println("Le compte deja existe");
            return;
        }
        accounts.add(account);
    }
    public ArrayList<BankAccount> list(){
        if(accounts.size() == 0){
            System.err.println("Accune compte");
            return accounts;
        }
        ArrayList<BankAccount> copy = new ArrayList<>(accounts);
        copy.sort((acc1, acc2) ->Double.compare(acc1.getBalance(), acc2.getBalance()));
        return copy;
    }
    public void deposer(BankAccount account, double amount){
        if(amount <= 0){
            System.err.println("Erreur : Solde invalid");
            return;
        }
        account.setBalance(account.getBalance() + amount);
    }
    public void withdraw(BankAccount account, double amount){
        if(amount <= 0 || amount > account.getBalance()){
            System.err.println("Erreur : Amount invalide");
            return;
        }
        account.setBalance(account.getBalance() - amount);
    }
    public  void transfert(BankAccount from, BankAccount to,  double amount){
        if(amount < 0 || from.getBalance() < amount){
            System.err.println("Erreur : Solde invalide");
            return;
        }
        if(from == to){
            System.out.println("Erreur : impossible de transferer");
            return;
        }
        
        from.transfert(to, amount);

    }
    public void delete(BankAccount account){
        for (BankAccount acc : accounts) {
            if(acc == account){
                accounts.remove(account);
                return;
            }
            System.err.println("Erreur : Ce compte n;existe pas");
        }
    }
    public void receipt(BankAccount account) {

    if (account == null) {
        System.err.println("Aucun compte");
        return;
    }

    System.out.println(String.format(
        "Numero du compte : %d%n" +
        "Date & Time : %s%n",
        account.getAccount_id(),
        LocalDateTime.now()
    ));

    System.out.println(String.format(
        "%-20s %-20s %-20s",
        "Type Operation", "Amount", "Date & Time"
    ));

    System.out.println(
        "---------------------------------------------------------------"
    );

    for (Operations op : account.getOperations()) {

        System.out.println(String.format(
            "%-20s %-20.2f %-20s",
            op.getType(),
            op.getAmount(),
            op.getDate()
        ));
    }

    System.out.println(
        "---------------------------------------------------------------"
    );
}
}
