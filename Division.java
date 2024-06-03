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
        double a= super.getOperande1().valeur();
        double b= super.getOperande2().valeur();

        return a/b ;
    }

    /*
     * retourne une chaine de caractères representant la division des opérandes 
     */
    public String toString()
    {
        return "(" + super.getOperande1() + " / " + super.getOperande2() + ")" ;
    }
}
