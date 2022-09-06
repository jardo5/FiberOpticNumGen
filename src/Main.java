import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);  // User inputs Intager
        System.out.println("Enter Number...");

        String[] fiberColors = {"Blue", "Orange", "Green", "Brown", "Slate", "White", "Red", "Black", "Yellow", "Violet", "Rose", "Aqua"};

        int calcNum = inputNum.nextInt(); // Read user input
        
         if (calcNum < 145) { 
            int modNum = (calcNum - 1) % 12; // Find the modulus number from 12
            System.out.println(modNum);
         }
         else if (calcNum >= 145) {
            System.out.println("Invalid Number/Over 144c"); // If user input is over 144 count
         }
        
        




    }
}