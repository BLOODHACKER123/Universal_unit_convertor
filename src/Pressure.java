import java.util.Scanner;

public class Pressure {
    public Pressure() {
        Scanner sc = new Scanner(System.in);
        int choice;
        double value, result;

        do {
            System.out.println("\n--- Pressure Converter ---");
            System.out.println("1. Pascals to Bar");
            System.out.println("2. Bar to Pascals");
            System.out.println("3. Atmospheres to Pascals");
            System.out.println("4. Pascals to Atmospheres");
            System.out.println("5. PSI to Pascals");
            System.out.println("6. Pascals to PSI");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Pascals: ");
                    value = sc.nextDouble();
                    result = value / 100000;
                    System.out.println("= " + result + " Bar");
                }
                case 2 -> {
                    System.out.print("Enter Bar: ");
                    value = sc.nextDouble();
                    result = value * 100000;
                    System.out.println("= " + result + " Pascals");
                }
                case 3 -> {
                    System.out.print("Enter Atmospheres: ");
                    value = sc.nextDouble();
                    result = value * 101325;
                    System.out.println("= " + result + " Pascals");
                }
                case 4 -> {
                    System.out.print("Enter Pascals: ");
                    value = sc.nextDouble();
                    result = value / 101325;
                    System.out.println("= " + result + " Atmospheres");
                }
                case 5 -> {
                    System.out.print("Enter PSI: ");
                    value = sc.nextDouble();
                    result = value * 6894.76;
                    System.out.println("= " + result + " Pascals");
                }
                case 6 -> {
                    System.out.print("Enter Pascals: ");
                    value = sc.nextDouble();
                    result = value / 6894.76;
                    System.out.println("= " + result + " PSI");
                }
                case 0 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
}
