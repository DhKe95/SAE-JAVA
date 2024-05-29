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
        double a =super.getOperande1().valeur()
        double b =super.getOperande2().valeur()
        return a-b
    }

    /*
     * retourne une chaine de caractères representant la soustraction des opérandes 
     */
    public String toString()
    {
        return "(" + super.getOperande1() + " - " + super.getOperande2() + ")" ;
    }
}
