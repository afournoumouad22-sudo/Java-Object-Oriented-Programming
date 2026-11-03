package TP03;

public class Produit {
    private String libelle;
    private  double prix;
    private TypeProduit type;
    
    public Produit(String libelle, double prix, TypeProduit type){
        this.libelle = libelle;
        this.prix = prix;
        this.type = type;
    }
    public String getLibelle() {
        return libelle;
    }
    public double getPrix() {
        return prix;
    }
    public double getType() {
        return type.getTva();
    }
}
