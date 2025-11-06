import java.util.Scanner;

public class Currency {
    public Currency() {
        Scanner sc = new Scanner(System.in);
        int choice;
        double value, result;

        // Static exchange rates (example only)
        double usdToLkr = 295.00;
        double eurToLkr = 320.00;
        double gbpToLkr = 370.00;
        double inrToLkr = 3.60;

        do {
            System.out.println("\n--- Currency Converter ---");
            System.out.println("1. USD to LKR");
            System.out.println("2. LKR to USD");
            System.out.println("3. EUR to LKR");
            System.out.println("4. LKR to EUR");
            System.out.println("5. GBP to LKR");
            System.out.println("6. LKR to GBP");
            System.out.println("7. INR to LKR");
            System.out.println("8. LKR to INR");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter USD: ");
                    value = sc.nextDouble();
                    result = value * usdToLkr;
                    System.out.println("= " + result + " LKR");
                }
                case 2 -> {
                    System.out.print("Enter LKR: ");
                    value = sc.nextDouble();
                    result = value / usdToLkr;
                    System.out.println("= " + result + " USD");
                }
                case 3 -> {
                    System.out.print("Enter EUR: ");
                    value = sc.nextDouble();
                    result = value * eurToLkr;
                    System.out.println("= " + result + " LKR");
                }
                case 4 -> {
                    System.out.print("Enter LKR: ");
                    value = sc.nextDouble();
                    result = value / eurToLkr;
                    System.out.println("= " + result + " EUR");
                }
                case 5 -> {
                    System.out.print("Enter GBP: ");
                    value = sc.nextDouble();
                    result = value * gbpToLkr;
                    System.out.println("= " + result + " LKR");
                }
                case 6 -> {
                    System.out.print("Enter LKR: ");
                    value = sc.nextDouble();
                    result = value / gbpToLkr;
                    System.out.println("= " + result + " GBP");
                }
                case 7 -> {
                    System.out.print("Enter INR: ");
                    value = sc.nextDouble();
                    result = value * inrToLkr;
                    System.out.println("= " + result + " LKR");
                }
                case 8 -> {
                    System.out.print("Enter LKR: ");
                    value = sc.nextDouble();
                    result = value / inrToLkr;
                    System.out.println("= " + result + " INR");
                }
                case 0 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
}
