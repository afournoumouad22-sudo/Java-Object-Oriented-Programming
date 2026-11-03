package TP03;
import java.util.Arrays;
public class Lyumine {
    private String nom;
    private boolean joyeux;
    private Lyumine[] connaissances = new Lyumine[20];
    private int nbcConnaissances;

    public Lyumine(String nom){
        this.nom = nom;
        System.out.println("Bonjour, je suis" + nom);
        nbcConnaissances = 0;
    }
    public boolean estJoyeux(){
        if(joyeux){
            return true;
        }
        return false;
    }
    public void devenirTriste(){
        this.joyeux = false;
    }
    public void devenirJoyeux(){
        this.joyeux = true;
    }
    public void sourire(){
        if(this.joyeux){
            System.out.println(this.nom + "::)");
            return;
        }
        System.out.println(this.nom + "::(");
        
    }
    public void   apprendreQueEstNe(Lyumine l){
        System.out.println(this.nom + "::) " + l.nom);
        if(!connait(l)){
            for(int j = 0; j < connaissances.length; j++){
                if(connaissances[j] == null){
                    this.connaissances[j] = l;
                    nbcConnaissances++;
                    break;  
            }
        }
    }
            
    }
    public  boolean connait(Lyumine l){
        boolean dejaConnue = false;
   
            for(int i = 0; i < connaissances.length; i++){
                if(this.connaissances[i] == l){
                    dejaConnue = true;
                    return dejaConnue;
                }
            }  
        return dejaConnue;
    }
    public void fairePresentationDesConnaissances() {
        for(int i = 0; i < nbcConnaissances; i++){
            for(int j = 0; j < nbcConnaissances; j++){
            Lyumine a = connaissances[i];
            Lyumine b = connaissances[j];
                if(a != null && b != null){
                    if(!a.connait(b) && a != b){
                    a.apprendreQueEstNe(b);
                }
                } 
            }  
        }
    }
    public void direLyuminesConnus(){
        int count = 0;
        for(int i = 0; i < connaissances.length; i++){
            if(connaissances[i] != null){
                count++;
            }
        }
        if(count == 0){
            System.out.println(nom + " : je ne connais personne.");
            return ;
        }
        String[] noms = new String[count];
        int j = 0;
        for(int i = 0; i < connaissances.length; i++){
            if(connaissances[i] != null){
                noms[j] = connaissances[i].nom;
                j++;
            }
        }
        Arrays.sort(noms);
        System.out.print(this.nom + " : je connais ");
        for(int i = 0; i < noms.length; i++){
            if(i == noms.length -1){
                System.out.println(noms[i]+".");
            }
            System.out.print(noms[i] + ", ");
            
        }
        System.out.println();

    }
    

    
}   
