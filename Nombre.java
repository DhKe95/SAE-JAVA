public class Nombre extends Expression{

    private int valeurNombre ;

    public Nombre()
    {
    }

    public Nombre(int nombre)
    {
        this.valeurNombre= nombre;
    }

    public int valeur()
    {
        return this.valeurNombre;
    }

    public String toString()
    {
        return "Le nombre est" + this.valeur() + "\n";
    }
}




