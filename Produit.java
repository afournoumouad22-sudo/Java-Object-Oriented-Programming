
public class Produit {
    private String reference, nom;
    private double prix;
    private int quantite; 
    private static int compteur;
    public Produit(String nom, double prix, int quantite){
        this.reference = "P"+ (compteur + 1);
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
        compteur++;
    }
    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }
    public double getPrix() {
        return prix;
    }
    public int getQuantite() {
        return quantite;
    }
    public void setPrix(double prix) {
        if(prix < 0){
            System.err.println("Prix refuse" + prix );
        }
        else{
            this.prix = prix;
        }
    }
    public void setQuantite(int quantite) {
        if(quantite < 0){
            System.err.println("Quantite refuse");
        }
        else{
            this.quantite = quantite;
        }
    }
    double valeurStock(){
        return  prix * quantite;
    }
    public  void appliquerRemise(double pourcentage){
        if(pourcentage < 0  || pourcentage > 50){
            System.err.println("Remise refuse" + pourcentage + "%");
            
        }
        else{
            double reduction = (prix * pourcentage) / 100;
            this.prix = this.prix - reduction; 
        }
    }
    public  static int getNombreProduits(){
        return  compteur;
    }
    public  String toString() {
        
        return reference + " - " + nom + " - " + prix + " DH x " + quantite;
    }
}
