import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class ProductsDrive
{
    public static void main (String[] args) throws FileNotFoundException
    {
        // creating an arraylist that will hold all the bodycare products
        ArrayList<BodyCareProducts> products = new ArrayList<>();
        
        // creating a scanner stream that reads data from the file
        Scanner file = new Scanner(new File("PK-BodyCare.txt"));
        String line = file.nextLine();
        
        // creating another scanner that will be for user input
        Scanner kb = new Scanner(System.in);
        
        while(file.hasNextLine())
        {
            // now splitting the file using the splitter in order for everything ot be used in the constructor
            String[] splitLine = line.split("\\. ");
            
            // putting all the answer inside the constructor
            // since each line has equal parts, therefore they can be used in the constructor in the following way
            // creating names using the array for easier coherenence
            String name = splitLine[0];
            String[] ingredients = splitLine[1].split(", ");
            String type = splitLine[2];
            String subType = splitLine[3];
            String[] fragrance = splitLine[4].split(", ");
            boolean active = Boolean.valueOf(splitLine[5]);
            
            // now addingn the above variables to create new body-product objects
            products.add(new BodyCareProducts(name, ingredients, type, subType, fragrance, active));
            
            // setting file as the next line
            line = file.nextLine();
        } // end of while loop
        
        // closing the file scanner
        file.close();
       
        // now creating user inputs and print statements to perform actions that are required for a coherent experience
        System.out.println
        (
            "-----------------------------------------------------------------------\n" + 
            "Welcome to Bath & Body Works Product Knowledge" + 
            "\n@author Ekamjot Singh" +
            "\nVersion 0.1a\n" +
            "-----------------------------------------------------------------------\n\n" +
            "Please make a selection:"
        );
        
        // creating a selection system print line
        System.out.println
        (
            "[1] Find Ingredients\n" +
            "[Q] Quit Application"
        );
        
        // using next item in scanner pool using keyboard
        String userInput = (String )kb.next();
        
        // creating a while loop that works until the said letter is not entered
        while(!userInput.equalsIgnoreCase("Q"))
        {
            // taking in the next userInput
            userInput = kb.next();
        } // end of while
        
    } // end of main
    
} // end of class