package TP03;

public enum TypeProduit {
    BOISSON(0.15),
    PATISSERIE(0.3);

    private double tva;
    TypeProduit(double tva){
        this.tva = tva;
    }
    public double getTva() {
        return tva;
    }

}
