public class Fraction {
    private int numerateur, dominateur;
    public Fraction(int numerateur, int dominateur){
        this.dominateur = dominateur;
        this.numerateur = numerateur;
        if(dominateur == 0){
            System.err.println("domminateru null remplace par 1");
            dominateur = 1;
        }
        int p = pgcd(numerateur, dominateur);
        this.numerateur = numerateur / p;
        this.dominateur = dominateur / p;
        }
        public static int pgcd(int a, int b){
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
            return  a;
        }
        public Fraction ajouter(Fraction autre){
            int  nv_num = (this.numerateur * autre.dominateur) + (autre.numerateur * this.dominateur);
            int  nv_dom = (this.dominateur * autre.dominateur);
            return  new Fraction(nv_num, nv_dom);
        }
        public Fraction multipier(Fraction autre){
            int nv_num = (this.numerateur * autre.numerateur);
            int nv_dom = (this.dominateur * autre.dominateur);
            return new Fraction(nv_num, nv_dom);
        }
        public boolean estEgale(Fraction autre){
            return (this.numerateur == autre.numerateur) && (this.dominateur == autre.dominateur);
        }
        public double valeur(){
            return  (double) numerateur / dominateur;
        }
       public String toString() {
            if (dominateur == 1) {
                return String.valueOf(numerateur);
            } else {
                return numerateur + "/" + dominateur;
            }
       }
    }

