public class ProduitsMain {
    public static void main(String[] args) {
        Produit P1 =  new Produit("CLavier", 150,  10);
        System.out.println(P1);
        Produit P2 = new Produit("Souris", 80, 0);
        System.err.println(P2);
        P2.setQuantite(25);
        P1.setPrix(-20);
        P1.appliquerRemise(20);
        P2.appliquerRemise(70);
        System.out.println(P1);
        System.out.println(P2);
        System.out.println("Valeur du Stock de  Clavier est : " + P1.valeurStock());
        System.out.println("le nombre de produits crees est : " + Produit.getNombreProduits());
}
}
