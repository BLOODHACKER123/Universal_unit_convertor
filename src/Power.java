import java.util.Scanner;

public class Power {
    public Power() {
        Scanner sc = new Scanner(System.in);
        int choice;
        double value, result;

        do {
            System.out.println("\n--- Power Converter ---");
            System.out.println("1. Watts to Kilowatts");
            System.out.println("2. Kilowatts to Watts");
            System.out.println("3. Watts to Horsepower");
            System.out.println("4. Horsepower to Watts");
            System.out.println("5. Kilowatts to Horsepower");
            System.out.println("6. Horsepower to Kilowatts");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Watts: ");
                    value = sc.nextDouble();
                    result = value / 1000;
                    System.out.println("= " + result + " Kilowatts");
                }
                case 2 -> {
                    System.out.print("Enter Kilowatts: ");
                    value = sc.nextDouble();
                    result = value * 1000;
                    System.out.println("= " + result + " Watts");
                }
                case 3 -> {
                    System.out.print("Enter Watts: ");
                    value = sc.nextDouble();
                    result = value / 745.7;
                    System.out.println("= " + result + " Horsepower");
                }
                case 4 -> {
                    System.out.print("Enter Horsepower: ");
                    value = sc.nextDouble();
                    result = value * 745.7;
                    System.out.println("= " + result + " Watts");
                }
                case 5 -> {
                    System.out.print("Enter Kilowatts: ");
                    value = sc.nextDouble();
                    result = value * 1.34102;
                    System.out.println("= " + result + " Horsepower");
                }
                case 6 -> {
                    System.out.print("Enter Horsepower: ");
                    value = sc.nextDouble();
                    result = value / 1.34102;
                    System.out.println("= " + result + " Kilowatts");
                }
                case 0 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
}
