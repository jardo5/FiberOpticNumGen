import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);  // User inputs Intager
        System.out.println("Enter Number...");

        String[] fiberColors = {"Blue", "Orange", "Green", "Brown", "Slate", "White", "Red", "Black", "Yellow", "Violet", "Rose", "Aqua"};
        String[] tubeColors = {"Blue", "Orange", "Green", "Brown", "Slate", "White", "Red", "Black", "Yellow", "Violet", "Rose", "Aqua"};

        int input = inputNum.nextInt(); // Read user input for Row
        
         if (input < 145) { 
            int rowNum = (input - 1) % fiberColors.length;   // Row
            System.out.println("The Fiber Color is.." + fiberColors[rowNum]);
            
            int colNum = (input - 1) / fiberColors.length;                  // Column
            System.out.println("The Tube Color is.." + fiberColors[colNum]);
         } else {
            System.out.println("Invalid input"); // Invalid input
         }
         
        
        

    }      
}