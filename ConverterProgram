import java.util.Scanner;

public class ConverterProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Converter");
        System.out.println("[1] Currency Converter");
        System.out.println("[2] Distance Converter");
        System.out.println("[3] Temperature Converter");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Currency Converter ($1 = PHP54)");
            System.out.println("[1] Dollar to Peso");
            System.out.println("[2] Peso to Dollar");
            System.out.print("Enter your choice: ");
            int currencyChoice = sc.nextInt();

            if (currencyChoice == 1) {
                System.out.print("Enter amount in Dollar: ");
                double dollar = sc.nextDouble();
                double peso = dollar * 54;
                System.out.printf("The equivalent of %.2f Dollar is %.2f Pesos.\n", dollar, peso);
            } else if (currencyChoice == 2) {
                System.out.print("Enter amount in Pesos: ");
                double peso = sc.nextDouble();
                double dollar = peso / 54;
                System.out.printf("The equivalent of %.2f Pesos is %.2f Dollar.\n", peso, dollar);
            } else {
                System.out.println("Invalid choice!");
            }

        } else if (choice == 2) {
            System.out.println("Distance Converter (km to miles)");
            System.out.println("[1] Kilometer to Mile");
            System.out.println("[2] Mile to Kilometer");
            System.out.print("Enter your choice: ");
            int distanceChoice = sc.nextInt();

            if (distanceChoice == 1) {
                System.out.print("Enter distance in Kilometer: ");
                double km = sc.nextDouble();
                double mile = km / 1.609;
                System.out.printf("The equivalent of %.2f Kilometer is %.2f Miles.\n", km, mile);
            } else if (distanceChoice == 2) {
                System.out.print("Enter distance in Miles: ");
                double mile = sc.nextDouble();
                double km = mile * 1.609;
                System.out.printf("The equivalent of %.2f Miles is %.2f Kilometer.\n", mile, km);
            } else {
                System.out.println("Invalid choice!");
            }

        } else if (choice == 3) {
            System.out.println("Temperature Converter (Celcius to Fahrenheit)");
            System.out.println("[1] Celcius to Fahrenheit");
            System.out.println("[2] Fahrenheit to Celcius");
            System.out.print("Enter your choice: ");
            int temperatureChoice = sc.nextInt();

            if (temperatureChoice == 1) {
                System.out.print("Enter temperature in Celcius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("The equivalent of %.2f Celcius is %.2f Fahrenheit.\n", celsius, fahrenheit);
            } else if (temperatureChoice == 2) {
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.printf("The equivalent of %.2f Fahrenheit is %.2f Celcius.\n", fahrenheit, celsius);
            } else {
                System.out.println("Invalid choice!");
            }

        } else {
            System.out.println("Invalid choice!");
        }
    }
}
