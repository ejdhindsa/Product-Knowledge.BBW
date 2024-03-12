// import statements
import java.util.ArrayList;

public class BodyCare extends Product
{
    // fields
    protected String type;
    protected ArrayList<BodyCareProducts> bcProducts;
    
    // CONTRUCTORS
    public BodyCare()
    {
        type = "unknown";
        bcProducts = new ArrayList<>();
    } // end of no-arg constructor
    
    public BodyCare(String name, String[] ingredients, String type)
    {
        super(name, ingredients);
        this.type = type;
        bcProducts = new ArrayList<>();
    } // end of full-arg constructor
    
    // GETTERS
    public String getType()
    {
        return this.type;
    } // end of getType()
    
    public ArrayList<BodyCareProducts> getBodyCareProducts()
    {
        return this.bcProducts;
    } // end of getBodyCareProducts()
    
    // SETTERS
    public void setType(String type)
    {
        this.type = type;
    } // end of setType()
    
    public void setBodyCareProducts(ArrayList<BodyCareProducts> bcProducts)
    {
        this.bcProducts = bcProducts;
    } // end of getBodyCareProducts()
    
    public void addBodyCareProduct(BodyCareProducts bcProduct)
    {
        bcProducts.add(bcProduct);
    } // end of addBodyCareProduct()
    
    // Utility Methods
    @Override
    public String toString()
    {
        return "Body Care: " + super.name + ", Ingredients: " + super.ingredients.toString();
    } // end of toString
    
} // end of class