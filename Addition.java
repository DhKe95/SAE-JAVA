public class Addition extends Operation
{
    /*
     * Constructeur vide
     */
    public Addition()
    {
        super();
    }

    /*
     * Constructeur champs à champs
     */
    public Addition(Expression valeur1,Expression valeur2)
    {
        super(valeur1, valeur2);
    }

    /*
     * retourne l'addition des operandes
     */
    public double valeur() 
    {
        double expression1 =super.getOperande1().valeur();
        double expression2 =super.getOperande2().valeur();
        return expression1 + expression2;
    }

    /*
     * retourne une chaine de caractères representant l'addition des opérandes 
     */
    public String toString()
    {
        return "(" + super.getOperande1() + " + " + super.getOperande2() + ")" ;    
    }
}



