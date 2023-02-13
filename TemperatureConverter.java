import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("[1] Celcius to Fahrenheit");
        System.out.println("[2] Fahrenheit to Celcius");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("You chose Celcius to Fahrenheit");
            System.out.print("Enter Temperature in Celcius: ");
            double celcius = sc.nextDouble();
            double fahrenheit = (celcius * 9 / 5) + 32;
            System.out.println("The Equivalent of " + celcius + " Celcius is " + fahrenheit + " Fahrenheit.");
        } else if (choice == 2) {
            System.out.println("You chose Fahrenheit to Celcius");
            System.out.print("Enter Temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celcius = (fahrenheit - 32) * 5 / 9;
            System.out.println("The Equivalent of " + fahrenheit + " Fahrenheit is " + celcius + " Celcius.");
        } else {
            System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}