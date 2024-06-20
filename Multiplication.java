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
    public Multiplication(Expression valeur1,Expression valeur2)
    {
        super(valeur1, valeur2);
    }

    /*
     * retourne la multiplication des operandes
     */
    public double valeur() 
    {
        double expression1 =super.getOperande1().valeur();
        double expression2 =super.getOperande2().valeur();
        return expression1 * expression2;
    }

    /*
     * retourne une chaine de caractères representant la multiplication des opérandes 
     */
    public String toString()
    {
        return "(" + super.getOperande1() + " * " + super.getOperande2() + ")" ;
    }
}

