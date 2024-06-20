public class Nombre extends Expression{

    private int valeurNombre ;

    /*
     * Constructeur vide
     */
    public Nombre()
    {
    }

    /*
     * Constructeur champs à champs
     */
    public Nombre(int nombre)
    {
        this.valeurNombre= nombre;
    }

    /*
     * retourne la variable d'instance
     */
    public double valeur()
    {
        return this.valeurNombre;
    }

    /*
     * retourne une chaine de caractères representant le nombre
     */
    public String toString()
    {
        return " " + this.valeur() + " ";
    }
}




