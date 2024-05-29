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
    public Soustraction(Nombre valeur1,Nombre valeur2)
    {
        super(valeur1, valeur2);
    }

    /*
     * retourne la soustraction des operandes
     */
    public double valeur() 
    {

        return super.getOperande1().valeur() - super.getOperande2().valeur();
    }

    /*
     * retourne une chaine de caractères representant la soustraction des opérandes 
     */
    public String toString()
    {
        return "(" + super.getOperande1() + " - " + super.getOperande2() + ")" ;
    }
}
