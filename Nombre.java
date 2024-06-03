public class Nombre extends Expression{

    private int valeurNombre ;


    public Nombre()
    {
    }

    public Nombre(int nombre)
    {
        this.valeurNombre= nombre;
    }

    public double valeur()
    {
        return this.valeurNombre;
    }

    public String toString()
    {
        return " " + this.valeur() + " ";
    }
}




