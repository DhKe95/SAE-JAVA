public class Division extends Operation{
    
    /*
     * Constructeur vide
     */
    public Division()
    {
        super();
    }

    /*
     * Constructeur champs à champs
     */
    public Division(Expression valeur1,Expression valeur2) throws Exception
    {
        super(valeur1, valeur2);
        if (super.getOperande2().valeur() == 0){
            throw new ArithmeticException("Ne peut pas diviser par un dénominateur null");
        }
    }

    /*
     * retourne la division des operandes
     */
    public double valeur() 
    {
        double expression1 = super.getOperande1().valeur();
        double expression2 = super.getOperande2().valeur();

        return expression1 / expression2 ;
    }

    /*
     * retourne une chaine de caractères representant la division des opérandes 
     */
    public String toString()
    {
        return "(" + super.getOperande1() + " / " + super.getOperande2() + ")" ;
    }
}
