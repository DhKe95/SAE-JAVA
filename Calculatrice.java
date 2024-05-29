public class Calculatrice {
    public static void main(String[] args) throws Exception {
        System.out.println("début du programme");

        Expression deux = new Nombre(2) ;
        Expression trois = new Nombre(3) ;
        Expression dixSept = new Nombre(17) ;
        Expression s = new Soustraction(dixSept, deux) ;
        Expression a = new Addition(deux, trois) ;
        try{
            Expression d = new Division(s, a) ;; // doit afficher une erreur
            System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3
            }
            catch(Exception er)
            {
                System.err.println("Erreur:" + er.getMessage());
            }

        System.out.println("fin du programme");
    }
}
