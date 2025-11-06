import java.util.Scanner;

public class Volume {
    public Volume() {
        Scanner sc = new Scanner(System.in);
        int choice;
        double value, result;

        do {
            System.out.println("\n--- Volume Converter ---");
            System.out.println("1. Liters to Milliliters");
            System.out.println("2. Milliliters to Liters");
            System.out.println("3. Liters to Gallons");
            System.out.println("4. Gallons to Liters");
            System.out.println("5. Cubic Meters to Liters");
            System.out.println("6. Liters to Cubic Meters");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Liters: ");
                    value = sc.nextDouble();
                    result = value * 1000;
                    System.out.println("= " + result + " Milliliters");
                    break;

                case 2:
                    System.out.print("Enter Milliliters: ");
                    value = sc.nextDouble();
                    result = value / 1000;
                    System.out.println("= " + result + " Liters");
                    break;

                case 3:
                    System.out.print("Enter Liters: ");
                    value = sc.nextDouble();
                    result = value * 0.264172;
                    System.out.println("= " + result + " Gallons");
                    break;

                case 4:
                    System.out.print("Enter Gallons: ");
                    value = sc.nextDouble();
                    result = value / 0.264172;
                    System.out.println("= " + result + " Liters");
                    break;

                case 5:
                    System.out.print("Enter Cubic Meters: ");
                    value = sc.nextDouble();
                    result = value * 1000;
                    System.out.println("= " + result + " Liters");
                    break;

                case 6:
                    System.out.print("Enter Liters: ");
                    value = sc.nextDouble();
                    result = value / 1000;
                    System.out.println("= " + result + " Cubic Meters");
                    break;

                case 0:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
}
