import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
   public static void main(String[] args) {

      String[] fiberColors = { "Blue", "Orange", "Green", "Brown", "Slate", "White", "Red", "Black", "Yellow", "Violet","Rose", "Aqua" }; // 12 Fiber colors

      Scanner enterConversion = new Scanner(System.in); // User inputs String Row (Fiber Color)
      System.out.println("Are you trying to convert Fiber # to Colors? Y or N");

      String conversion;
      conversion = enterConversion.nextLine();

      if (conversion.equals("Y")) {

         // Number Conversion

         Scanner inputNum = new Scanner(System.in); // User inputs Int
         System.out.println("Only Supporting 144 Count!");
         System.out.println("Enter Fiber Number...");

         int numInput = inputNum.nextInt(); // Read user input for Number
         if (numInput < 145) {
            int rowNum = (numInput - 1) % fiberColors.length; // Row
            System.out.println("The Fiber Color is.." + fiberColors[rowNum]);

            int colNum = (numInput - 1) / fiberColors.length; // Column
            System.out.println("The Tube Color is.." + fiberColors[colNum]);
         } else {
            System.out.println("Invalid input"); // Invalid input
         }

      } else if (conversion.equals("N")) {

         // Row Conversion

         Scanner inputRow = new Scanner(System.in); // User inputs String Row (Fiber Color)
         System.out.println("Enter Fiber color");

         List<String> fiberList = Arrays.asList(fiberColors); // Convert fiberColors to ArrayList
         System.out.println("Supported Colors: " + fiberList); // List all fiber colors

         int rowOutput = 0;

         String input = inputRow.next();
         if (fiberList.contains(input)) { // Check if inputRow is equal to a fiber color
            int rowConversion = fiberList.indexOf(input); // Convert from input to index of fiberList
            rowOutput = rowConversion;
            System.out.println("output: " + rowOutput);
         } else {
            System.out.println("Invalid input");
         }

         // Column Conversion

         Scanner inputColumn = new Scanner(System.in); // User inputs String Column (Tube Color)
         System.out.println("Enter Tube color");

         int columnOutput = 0;

         String columnInput = inputRow.next();
         if (fiberList.contains(input)) { // Check if inputRow is equal to a fiber color
            int columnConversion = fiberList.indexOf(columnInput); // Convert from input to index of fiberList
            columnOutput = columnConversion;
            System.out.println("output: " + columnOutput);
         } else {
            System.out.println("Invalid input");
         }

         int numOutput = (columnOutput * fiberColors.length) + (rowOutput + 1 % fiberColors.length); // Inverse colNum and rowNum calculations
         System.out.println(numOutput);

      }
   }

}
