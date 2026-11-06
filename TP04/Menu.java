package TP04;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<String> options;
    private Scanner sc;
    
    public Menu(String title, ArrayList<String> options, Scanner sc){
        this.options = options;
        this.sc = sc;
    }
    public  void  display(){
        int i =0;
        for (String option : options) {
            System.out.println(i+1 + ": " + option);
            i++;
        }
    }
    public int choice(){
        int choic;
        do{
            display();
            System.out.print("Entrer votre choix : ");
            choic = sc.nextInt();
        }while(choic != -1 && (choic < 1 || choic > options.size()));
        return choic;
    }
    Bank bank1 = new Bank();
    

}
