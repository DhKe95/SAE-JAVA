public class CalculatriceSimple {
    public static void main(String[] args) throws Exception {
        System.out.println("début du programme");

        /*
         * Déclaration des variables de type Nombre
         */
        Nombre six = new Nombre(6) ;
        Nombre dix = new Nombre(10) ;
        Nombre deux = new Nombre(2) ;
        Nombre moinsSix = new Nombre(-6) ;
        Nombre moinsDix = new Nombre(-10) ;
        Nombre zero = new Nombre(0) ;

        /*
         * test Addition
         */
        Operation a = new Addition(dix,six) ;
        System.out.println(a + " = " + a.valeur()) ; // doit afficher : (10 + 6) = 16
        
        /*
         * test Soustraction
         */
        Operation s2 = new Soustraction(moinsDix,moinsSix);
        System.out.println(s2 + " = " + s2.valeur()); // doit afficher :(-10 - -6) = -4

        /*
         * test Multiplication
         */
        Operation m = new Multiplication(moinsSix,moinsDix); // doit afficher :(-6 * -10) = 60
        System.out.println(m + " = " + m.valeur()) ;

        /*
         * test Division
         */
        Operation d = new Division(dix,deux); // doit afficher : (10 / 2) = 5
        System.out.println(d + " = " + d.valeur()) ;

        /*
         * test erreur
         */
        try{
        Operation e = new Division(dix,zero); // doit afficher une erreur
        System.out.println(e + " = " + e.valeur()) ;
        }
        catch(Exception er)
        {
            System.err.println("Erreur:" + er.getMessage());
        }
        

        System.out.println("fin du programme");
    }
}
