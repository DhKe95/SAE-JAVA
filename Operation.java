public abstract class Operation extends Expression{
    private Expression Operande1;
    private Expression Operande2;

    /*
     * Constructeur vide
     */
    public Operation()
    {}

    /*
     * Constructeur champs à champs
     */
    public Operation(Expression valeur1,Expression valeur2)
    {
        this.Operande1= valeur1;
        this.Operande2= valeur2;
    }

    /*
     * Méthode abstraite
     */
    public abstract double valeur();

    
    public Expression getOperande1()
    {

        return this.Operande1;
    }

    public Expression getOperande2()
    {
        return this.Operande2;
    }

}
