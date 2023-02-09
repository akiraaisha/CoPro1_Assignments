import java.util.Scanner;

class PayslipGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter hourly rate: ");
        int hourlyRate = sc.nextInt();

        System.out.print("Enter Total of hours worked: ");
        int hoursWorked = sc.nextInt();

        System.out.print("Enter Total Tardiness in Hour: ");
        int tardiness = sc.nextInt();

        int grossPay = hoursWorked * hourlyRate;
        int TardinessAmount = tardiness * hourlyRate;
        int netPay = grossPay - TardinessAmount;

        System.out.println("\nPaySlip");
        System.out.println("Employee Name: " + name);
        System.out.println("Rate/hr: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Pay: PHP " + grossPay);
        System.out.println("Total Tardiness: " + TardinessAmount);
        System.out.println("Net Pay: PHP " + netPay);
    }
}
