import java.util.Scanner;

public class Energy {
    public Energy() {
        Scanner sc = new Scanner(System.in);
        int choice;
        double value, result;

        do {
            System.out.println("\n--- Energy Converter ---");
            System.out.println("1. Joules to Calories");
            System.out.println("2. Calories to Joules");
            System.out.println("3. Joules to Kilowatt-hours");
            System.out.println("4. Kilowatt-hours to Joules");
            System.out.println("5. Calories to Kilojoules");
            System.out.println("6. Kilojoules to Calories");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Joules: ");
                    value = sc.nextDouble();
                    result = value / 4.184;
                    System.out.println("= " + result + " Calories");
                }
                case 2 -> {
                    System.out.print("Enter Calories: ");
                    value = sc.nextDouble();
                    result = value * 4.184;
                    System.out.println("= " + result + " Joules");
                }
                case 3 -> {
                    System.out.print("Enter Joules: ");
                    value = sc.nextDouble();
                    result = value / 3.6e6;
                    System.out.println("= " + result + " Kilowatt-hours");
                }
                case 4 -> {
                    System.out.print("Enter Kilowatt-hours: ");
                    value = sc.nextDouble();
                    result = value * 3.6e6;
                    System.out.println("= " + result + " Joules");
                }
                case 5 -> {
                    System.out.print("Enter Calories: ");
                    value = sc.nextDouble();
                    result = value * 0.004184;
                    System.out.println("= " + result + " Kilojoules");
                }
                case 6 -> {
                    System.out.print("Enter Kilojoules: ");
                    value = sc.nextDouble();
                    result = value / 0.004184;
                    System.out.println("= " + result + " Calories");
                }
                case 0 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
}
