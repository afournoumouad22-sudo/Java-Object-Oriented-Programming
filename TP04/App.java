
package TP04;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        ArrayList<String> options = new ArrayList<>(Arrays.asList(
            "List All Account",
            "Search for Account",
            "Create Account",
            "Delete Account",
            "Deposit Amount",
            "Withdraw Amount",
            "Transfer",
            "Receipt",
            "Exit"
        ));

        Menu menu = new Menu("Managemen des comptes", options, sc);

        while (true) {
            int c = menu.choice();

            if (c == -1 || c == 9) {
                System.out.println("Au revoir!");
                break;
            }

            switch (c) {

                case 1:
                    
                    for (BankAccount account : bank.list()) {
                        System.out.println(account);
                    }
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int num = sc.nextInt();
                    BankAccount aacc = bank.search(num);
                    if(aacc != null){
                        System.out.println(aacc.toString());
                    }
                    break;
                case 3:
                    System.out.println("1. Savving Account.");
                    System.out.println("2. Cheking Account");
                    System.out.print("Choisir le type : ");
                    int type = sc.nextInt();
                    if(type == 1){
                    System.out.println("1 : Oui ");
                    System.out.println("2 : Non");
                    System.out.print("vous avez le solde initial : (oui) ou (non) : ");
                    int CSolde = sc.nextInt();
                    if(CSolde == 1){
                        System.out.print("Enter initial balance: ");
                        double soldeini = sc.nextDouble();
                        System.out.print("Entrer Taux d'interet : ");
                        float interet = sc.nextFloat();
                        if(soldeini < 0){
                            System.err.println("solde impossible");
                            break ;
                        }
                        BankAccount acc = new SavvingAccount(interet, soldeini);

                        bank.create(acc);
                    }
                    else if(CSolde == 2){
                        System.out.print("Entrer Taux d'interet : ");
                        float interet = sc.nextFloat();
                        BankAccount acc = new SavvingAccount(interet, 0);
                        bank.create(acc);
                        
                    }   
                    else{
                        System.err.println("Choix invalide");
                        
                    }
                    
                    }else if(type == 2){
                        System.out.println("1 : Oui ");
                        System.out.println("2 : Non");
                        System.out.print("vous avez le solde initial : (oui) ou (non) : ");
                        int CSolde = sc.nextInt();
                        if(CSolde == 1){
                            System.out.print("Enter initial balance: ");
                            double soldeini = sc.nextDouble();
                            if(soldeini < 0){
                                System.err.println("solde impossible");
                                break ;
                            }
                            BankAccount acc = new ChekingAccount(soldeini);

                            bank.create(acc);
                        }
                    else if(CSolde == 2){
                            BankAccount acc = new ChekingAccount(0);
                            bank.create(acc);
                        }
                    else{
                            System.err.println("Choix invalide");
                        
                    }
                        
                    }
                    else{
                        System.err.println("Choix invalide");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    int numDelete = sc.nextInt();
                    bank.delete(bank.search(numDelete));

                    break;

                case 5:
                    System.out.print("Enter account number: ");
                    int numDepot = sc.nextInt();
                    System.out.print("Entrer le solde : ");
                    double soldeD = sc.nextDouble();
                    bank.deposer(bank.search(numDepot), soldeD);
                    break;

                case 6:
                    System.out.print("Enter account number: ");
                    int numRetrait = sc.nextInt();
                    System.out.print("Entrer le solde : ");
                    double soldeR = sc.nextDouble();
                    bank.withdraw(bank.search(numRetrait), soldeR);
                    break;

                case 7:
                    System.out.print("Enter account (from) number: ");
                    int numFrom = sc.nextInt();
                    System.out.print("Enter account (to) number: ");
                    int numTo = sc.nextInt();
                    System.out.print("Entrer le solde : ");
                    double soldeTransfert = sc.nextDouble();
                    bank.transfert(bank.search(numFrom), bank.search(numTo), soldeTransfert);
                    break;

                case 8:
                    System.out.print("Enter account number: ");
                    int numRE = sc.nextInt();
                    bank.receipt(bank.search(numRE));
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}

