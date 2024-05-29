public abstract class Operation extends Expression{
    private Nombre Operande1;
    private Nombre Operande2;

    public Operation()
    {}

    public Operation(Nombre valeur1,Nombre valeur2)
    {
        this.Operande1= valeur1;
        this.Operande2= valeur2;
    }

    public abstract double valeur();

    public int getOperande1()
    {

        return this.Operande1.valeur();
    }

    public int getOperande2()
    {
        return this.Operande2.valeur();
    }

}
