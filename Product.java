// import statements
import java.util.ArrayList;

public abstract class Product
{
    // fields
    protected String name;
    protected String[] ingredients;
    protected ArrayList<BodyCare> bodyCare;
    
    // CONSTRUCTORS
    public Product()
    {
        this.name = "unknown";
        bodyCare = new ArrayList<>();
    } // end of product()
    
    public Product(String name, String[] ingredients)
    {
        this.name = name;
        this.ingredients = ingredients;
        bodyCare = new ArrayList<>();
    } // end of ingredients()
    
    // GETTERS
    
    public String getName()
    {
        return this.name;
    } // end of getName()
    
    public String[] getIngredients()
    {
        return this.ingredients;
    } // end of getIngredients()
    
    public ArrayList<BodyCare> getBodyCare()
    {
        return this.bodyCare;
    } // end of getBodyCareProducts()
    
    // SETTERS
    
    public void setName(String name)
    {
        this.name = name;
    } // end of setName()
    
    public void setIngredients(String[] ingredients)
    {
        this.ingredients = ingredients;
    } // end of setIngredients()
    
    public void setBodyCare(ArrayList<BodyCare> bodyCare)
    {
        this.bodyCare = bodyCare;
    } // end of getBodyCareProducts()
    
    // Utility Methods

    public void addBodyCare(BodyCare bodyCare)
    {
        this.bodyCare.add(bodyCare);
    } // end of addBodyCareProduct()
    
    @Override
    public String toString()
    {
        return name + ": , Ingredients: " + ingredients.toString();
    } // end of toString()
    
} // end of Product