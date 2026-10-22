public class FractionMain {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        System.out.println(f1 + " + " + f2 + " = " + f1.ajouter(f2));
        System.out.println(f1 + " x " + f2 + " = " + f1.multipier(f2));
        Fraction f3 = new Fraction(2, 4);
        System.out.println("2/4 simplifiée : " + f3);
        System.out.println(f1 + " égale " + f3 + " ? " + f1.estEgale(f3));
        System.out.println("6/-3 : " + new Fraction(6, -3));
        Fraction somme = f1.ajouter(f2);
        System.out.println("Valeur de " + somme + " : " + somme.valeur());
        System.out.println("5/0 : " + new Fraction(5, 0));
        System.out.println("f1 après les calculs : " + f1);

    }
}
