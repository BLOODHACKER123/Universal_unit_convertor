import java.util.Scanner;

public class Angle {
    public Angle() {
        Scanner sc = new Scanner(System.in);
        int choice;
        double value, result;

        do {
            System.out.println("\n--- Angle Converter ---");
            System.out.println("1. Degrees to Radians");
            System.out.println("2. Radians to Degrees");
            System.out.println("3. Degrees to Gradians");
            System.out.println("4. Gradians to Degrees");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Degrees: ");
                    value = sc.nextDouble();
                    result = Math.toRadians(value);
                    System.out.println("= " + result + " Radians");
                }
                case 2 -> {
                    System.out.print("Enter Radians: ");
                    value = sc.nextDouble();
                    result = Math.toDegrees(value);
                    System.out.println("= " + result + " Degrees");
                }
                case 3 -> {
                    System.out.print("Enter Degrees: ");
                    value = sc.nextDouble();
                    result = value * (10.0 / 9.0);
                    System.out.println("= " + result + " Gradians");
                }
                case 4 -> {
                    System.out.print("Enter Gradians: ");
                    value = sc.nextDouble();
                    result = value * (9.0 / 10.0);
                    System.out.println("= " + result + " Degrees");
                }
                case 0 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
}
