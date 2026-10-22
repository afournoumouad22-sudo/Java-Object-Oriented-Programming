public class CompteBancaire{
    String titulaire;
    double solde;
    public CompteBancaire(String titulaire, double Soldinitial){
        this.titulaire = titulaire;
        this.solde = Soldinitial;
    }
    public  void deposer(double montant){
        if(montant > 0){
            solde = solde + montant;
        }
        else{
            System.out.println("Depot refuse");
        }
    }
    public void retirer(double montant){
        if(montant < solde){
            solde = solde - montant;
            
        }
        else{
            System.out.println("Solde insuffisante pour " + titulaire);
        }
    }
    public  void afficher(){
        System.out.println("titulaire : " + titulaire + " | Solde : " + solde);
        
    }
    public static void main(String[] args) {
        CompteBancaire c1 = new CompteBancaire("Amina", 1000);
        CompteBancaire c2 = new CompteBancaire("Youssef", 500);
        c1.deposer(250);
        c2.retirer(800);
        c2.retirer(200);
        c1.afficher();
        c2.afficher();
        CompteBancaire c3 = c1;
        c3.deposer(100);
        c1.afficher();
        c1.solde = -5000;
    }
}