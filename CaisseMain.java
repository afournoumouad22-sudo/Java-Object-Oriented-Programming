package TP03;
public class CaisseMain {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(1);
        Produit produit2 = new Produit("Jus d'orange", 12, TypeProduit.BOISSON);
        Produit produit4 = new Produit("caffe noir", 9, TypeProduit.BOISSON);
        ticket1.ajouter(produit4, 2);
        ticket1.ajouter(produit4, 4);
        ticket1.editerTicket();
        Ticket ticket2 = new Ticket(2);
        ticket2.ajouter(produit2, 3);
        ticket2.editerTicket();

    }
    
}
