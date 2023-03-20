import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        
        // create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // take input from the user for starting number, ending number, and multiple
        System.out.println("Multiplication Table");
        System.out.print("Enter Starting Number: ");
        int start = input.nextInt();
        System.out.print("Enter Ending Number: ");
        int end = input.nextInt();
        System.out.print("Enter Multiple: ");
        int multiple = input.nextInt();
        
        // print the multiplication table
        System.out.println("\nMultiplication Table of " + multiple);
        for (int i = start; i <= end; i++) {
            System.out.println(i + " x " + multiple + " = " + (i * multiple));
        }
    }

}
