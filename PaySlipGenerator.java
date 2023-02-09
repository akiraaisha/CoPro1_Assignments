import java.text.DecimalFormat;
import java.util.Scanner;

class PayslipGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = sc.nextDouble();

        System.out.print("Enter Total of hours worked: ");
        int hoursWorked = sc.nextInt();

        System.out.print("Enter Total Tardiness in Hour: ");
        int tardiness = sc.nextInt();

        double grossPay = hoursWorked * hourlyRate;
        double netPay = grossPay - (hourlyRate * tardiness);

        System.out.println("\nPaySlip");
        System.out.println("Employee Name: " + name);
        System.out.println("Rate/hr: " + df.format(hourlyRate));
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Pay: PHP " + df.format(grossPay));
        System.out.println("Total Tardiness: " + tardiness);
        System.out.println("Gross Pay: PHP " + df.format(netPay));
    }
}
