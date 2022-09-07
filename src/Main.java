import java.util.Scanner;
import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);  // User inputs Int
        System.out.println("Only Supporting 144 Count!");
        System.out.println("Enter Fiber Number...");

        String[] fiberColors = {"Blue", "Orange", "Green", "Brown", "Slate", "White", "Red", "Black", "Yellow", "Violet", "Rose", "Aqua"}; //12 Fiber colors

        int numInput = inputNum.nextInt(); // Read user input for Number
         if (numInput < 145) { 
            int rowNum = (numInput - 1) % fiberColors.length;   // Row
            System.out.println("The Fiber Color is.." + fiberColors[rowNum]);
            
            int colNum = (numInput - 1) / fiberColors.length;                  // Column
            System.out.println("The Tube Color is.." + fiberColors[colNum]);
         } else {
            System.out.println("Invalid input"); // Invalid input
         }




         Scanner inputRow = new Scanner(System.in);  // User inputs String Row (Fiber Color)
         System.out.println("Enter Fiber color"); 

         String rowColor = inputRow.nextLine(); // Read user input for Row



    }

}



         // Arrays.sort(fiberColors);  Sort fiberColors array for binarySearch

         // System.out.println(numRow + " Was Found at " + Arrays.binarySearch(fiberColors, numRow));