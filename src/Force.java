import java.util.Scanner;

public class Force {
    public Force() {
        Scanner sc = new Scanner(System.in);
        int choice;
        double value, result;

        do {
            System.out.println("\n--- Force Converter ---");
            System.out.println("1. Newtons to Kilonewtons");
            System.out.println("2. Kilonewtons to Newtons");
            System.out.println("3. Newtons to Dynes");
            System.out.println("4. Dynes to Newtons");
            System.out.println("5. Newtons to Pound-force");
            System.out.println("6. Pound-force to Newtons");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Newtons: ");
                    value = sc.nextDouble();
                    result = value / 1000;
                    System.out.println("= " + result + " Kilonewtons");
                }
                case 2 -> {
                    System.out.print("Enter Kilonewtons: ");
                    value = sc.nextDouble();
                    result = value * 1000;
                    System.out.println("= " + result + " Newtons");
                }
                case 3 -> {
                    System.out.print("Enter Newtons: ");
                    value = sc.nextDouble();
                    result = value * 100000;
                    System.out.println("= " + result + " Dynes");
                }
                case 4 -> {
                    System.out.print("Enter Dynes: ");
                    value = sc.nextDouble();
                    result = value / 100000;
                    System.out.println("= " + result + " Newtons");
                }
                case 5 -> {
                    System.out.print("Enter Newtons: ");
                    value = sc.nextDouble();
                    result = value * 0.224809;
                    System.out.println("= " + result + " Pound-force");
                }
                case 6 -> {
                    System.out.print("Enter Pound-force: ");
                    value = sc.nextDouble();
                    result = value / 0.224809;
                    System.out.println("= " + result + " Newtons");
                }
                case 0 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
}
