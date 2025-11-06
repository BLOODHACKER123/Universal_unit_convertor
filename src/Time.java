import java.util.Scanner;

public class Time {
    public Time() {
        Scanner sc = new Scanner(System.in);
        int choice;
        double value, result;

        do {
            System.out.println("\n--- Time Converter ---");
            System.out.println("1. Seconds to Minutes");
            System.out.println("2. Minutes to Seconds");
            System.out.println("3. Minutes to Hours");
            System.out.println("4. Hours to Minutes");
            System.out.println("5. Hours to Days");
            System.out.println("6. Days to Hours");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Seconds: ");
                    value = sc.nextDouble();
                    result = value / 60;
                    System.out.println("= " + result + " Minutes");
                }
                case 2 -> {
                    System.out.print("Enter Minutes: ");
                    value = sc.nextDouble();
                    result = value * 60;
                    System.out.println("= " + result + " Seconds");
                }
                case 3 -> {
                    System.out.print("Enter Minutes: ");
                    value = sc.nextDouble();
                    result = value / 60;
                    System.out.println("= " + result + " Hours");
                }
                case 4 -> {
                    System.out.print("Enter Hours: ");
                    value = sc.nextDouble();
                    result = value * 60;
                    System.out.println("= " + result + " Minutes");
                }
                case 5 -> {
                    System.out.print("Enter Hours: ");
                    value = sc.nextDouble();
                    result = value / 24;
                    System.out.println("= " + result + " Days");
                }
                case 6 -> {
                    System.out.print("Enter Days: ");
                    value = sc.nextDouble();
                    result = value * 24;
                    System.out.println("= " + result + " Hours");
                }
                case 0 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
}
