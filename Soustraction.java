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
    public int valeur() 
    {
        int a=super.getOperande1();
        int b=super.getOperande2();
        return a - b;
    }

    /*
     * retourne une chaine de caractères representant la soustraction des opérandes 
     */
    public String toString()
    {
        return "(" + super.getOperande1() + " - " + super.getOperande2() + ")" ;
    }
}
