public class BodyCare extends Product
{
    // fields
    protected String type;
    
    // CONTRUCTORS
    public BodyCare()
    {
        type = "unknown";
    } // end of no-arg constructor
    
    public BodyCare(String name, String[] ingredients, String type)
    {
        super(name, ingredients);
        this.type = type;
    } // end of full-arg constructor
    
    // GETTERS
    public String getType()
    {
        return this.type;
    } // end of getType()
    
    // SETTERS
    public void setType(String type)
    {
        this.type = type;
    } // end of setType()
    
    // Utility Methods
    @Override
    public String toString()
    {
        return "Home Care: " + super.name + ", Ingredients: " + super.ingredients.toString();
    } // end of toString
    
} // end of class