public class Soustraction extends Operation{
    
    /*
     * Constructeur vide
     */
    public Soustraction()
    {
        super();
    }

    /*
     * Constructeur champs à champs
     */
    public Soustraction(Expression valeur1,Expression valeur2)
    {
        super(valeur1, valeur2);
    }

    /*
     * retourne la soustraction des operandes
     */
    public double valeur() 
    {
        double expression1 =super.getOperande1().valeur();
        double expression2 =super.getOperande2().valeur();
        return expression1 - expression2;
    }

    /*
     * retourne une chaine de caractères representant la soustraction des opérandes 
     */
    public String toString()
    {
        return "(" + super.getOperande1() + " - " + super.getOperande2() + ")" ;
    }
}
