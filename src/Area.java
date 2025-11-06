import java.util.Scanner;

public class Area {
    public Area() {
        Scanner sc = new Scanner(System.in);
        int choice;
        double value, result;

        do {
            System.out.println("\n--- Area Converter ---");
            System.out.println("1. Square meters to Square feet");
            System.out.println("2. Square feet to Square meters");
            System.out.println("3. Square kilometers to Square miles");
            System.out.println("4. Square miles to Square kilometers");
            System.out.println("5. Acres to Hectares");
            System.out.println("6. Hectares to Acres");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Square meters: ");
                    value = sc.nextDouble();
                    result = value * 10.7639;
                    System.out.println("= " + result + " Square feet");
                }
                case 2 -> {
                    System.out.print("Enter Square feet: ");
                    value = sc.nextDouble();
                    result = value / 10.7639;
                    System.out.println("= " + result + " Square meters");
                }
                case 3 -> {
                    System.out.print("Enter Square kilometers: ");
                    value = sc.nextDouble();
                    result = value * 0.386102;
                    System.out.println("= " + result + " Square miles");
                }
                case 4 -> {
                    System.out.print("Enter Square miles: ");
                    value = sc.nextDouble();
                    result = value / 0.386102;
                    System.out.println("= " + result + " Square kilometers");
                }
                case 5 -> {
                    System.out.print("Enter Acres: ");
                    value = sc.nextDouble();
                    result = value * 0.404686;
                    System.out.println("= " + result + " Hectares");
                }
                case 6 -> {
                    System.out.print("Enter Hectares: ");
                    value = sc.nextDouble();
                    result = value / 0.404686;
                    System.out.println("= " + result + " Acres");
                }
                case 0 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
}
