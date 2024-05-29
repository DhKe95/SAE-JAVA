public class Multiplication extends Operation {
    
    /*
     * Constructeur vide
     */
    public Multiplication()
    {
        super();
    }

    /*
     * Constructeur champs à champs
     */
    public Multiplication(Nombre valeur1,Nombre valeur2)
    {
        super(valeur1, valeur2);
    }

    /*
     * retourne la multiplication des operandes
     */
    public int valeur() 
    {
        int a=super.getOperande1();
        int b=super.getOperande2();
        return a * b;
    }

    /*
     * retourne une chaine de caractères representant la multiplication des opérandes 
     */
    public String toString()
    {
        return "(" + super.getOperande1() + " * " + super.getOperande2() + ")" ;
    }
}

