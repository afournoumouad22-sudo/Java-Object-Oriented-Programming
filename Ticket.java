package TP03;

public class Ticket {
    private static  int nbConsommation;
    private int numeroTable;
    private Produit[] produit = new Produit[10];
    private  int[] quantite = new int[10];
    private int nbLignes;
    public Ticket(int numeroTable){
        this.numeroTable = numeroTable;
        nbLignes = 0;
        nbConsommation = 0;
    }
    public  void  ajouter(Produit p, int quantite){
        if( quantite <= 0 || p == null){
            System.err.println("ERREUR");
            return;
        }
        if(nbLignes > 10){
            System.out.println("TICKET plein");
            return ;
        }
        this.produit[nbLignes] = p;
        this.quantite[nbLignes] = quantite;
        nbLignes++;
        nbConsommation++;
    }
    public  double total(){
        double totall = 0;
        for(int i = 0 ; i < nbLignes; i++){
        totall = totall +  (produit[i].getPrix() * quantite[i] * (1 + produit[i].getType()));
        }
        return  totall;
    }
    public void  editerTicket(){
        System.out.println("Numero du tableau :" + this.numeroTable);
        System.out.printf("%-16s%8s%8s%10s%n",
    "Libelle", "Prix", "Type", "Quantite");
        for (int i = 0; i < nbLignes; i++) {System.out.println(String.format("%-16s%8.2f%7.0f %%%10d"
            , produit[i].getLibelle(), 
            produit[i].getPrix(), produit[i].getType() * 100, quantite[i]));
        }
        System.out.println("TOTAL : " + total());
        System.out.println("Nombre de consommation : " + nbConsommation);
    }
    public static int getNbConsommation() {
        return nbConsommation;
    }

}
