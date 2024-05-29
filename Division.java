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
    public Division(Nombre valeur1,Nombre valeur2) throws Exception
    {
        super(valeur1, valeur2);
        if (super.getOperande2() == 0){
            throw new ArithmeticException("Ne peut pas diviser par un dénominateur null");
        }
    }

    /*
     * retourne la division des operandes
     */
    public int valeur() 
    {
        int a=super.getOperande1();
        int b=super.getOperande2();
        int res= a / b;
        return res;
    }

    /*
     * retourne une chaine de caractères representant la division des opérandes 
     */
    public String toString()
    {
        return "(" + super.getOperande1() + " / " + super.getOperande2() + ")" ;
    }
}

