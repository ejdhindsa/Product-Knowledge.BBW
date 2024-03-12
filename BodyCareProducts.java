public class BodyCareProducts extends BodyCare
{
    // fields
    protected String subType;
    protected String[] fragrance;
    protected boolean active;
    private BodyCare bodycare;
    
    // constructor
    public BodyCareProducts()
    {
        this.active = false;
        this.subType = "unknown";
        this.fragrance = null;
    } // end of no-arg constructor
    
    public BodyCareProducts(String name, String[] ingredients, String type, String subType, String[] fragrance, boolean active)
    {
        super(name, ingredients, type);
        this.subType = subType;
        this.fragrance = fragrance;
        this.active = active;
    } // end of full-arg constructor
    
    // GETTERS
    public String getSubType()
    {
        return this.subType;
    } // end of getSubType
    
    public String[] getFragrance()
    {
        return this.fragrance;
    } // end of getFragrance()
    
    public boolean isActive()
    {
        return active;
    } // end of isActive()
    
    // SETTERS
    public void setSubType(String subType)
    {
        this.subType = subType;
    } // end of setSybStype()
    
    public void setFragrance(String[] fragrance)
    {
        this.fragrance = fragrance;
    } // end of setFragrance()
    
    public void setActive(boolean active)
    {
        this.active = active;
    } // end of setActive
    
    // Utility methods
    @Override
    public String toString()
    {
        return this.bodyCare + "\nCategory: " + this.subType + " , Fragrance: " + this.fragrance.toString() + ", Active: " + active;
    } // end of toString
    
    
} // end of class