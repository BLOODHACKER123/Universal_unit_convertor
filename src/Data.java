import java.util.Scanner;

public class Data {
    public Data() {
        Scanner sc = new Scanner(System.in);
        int choice;
        double value, result;

        do {
            System.out.println("\n--- Data Storage Converter ---");
            System.out.println("1. Bits to Bytes");
            System.out.println("2. Bytes to Bits");
            System.out.println("3. Bytes to Kilobytes");
            System.out.println("4. Kilobytes to Bytes");
            System.out.println("5. Kilobytes to Megabytes");
            System.out.println("6. Megabytes to Kilobytes");
            System.out.println("7. Megabytes to Gigabytes");
            System.out.println("8. Gigabytes to Megabytes");
            System.out.println("9. Gigabytes to Terabytes");
            System.out.println("10. Terabytes to Gigabytes");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Bits: ");
                    value = sc.nextDouble();
                    result = value / 8;
                    System.out.println("= " + result + " Bytes");
                }
                case 2 -> {
                    System.out.print("Enter Bytes: ");
                    value = sc.nextDouble();
                    result = value * 8;
                    System.out.println("= " + result + " Bits");
                }
                case 3 -> {
                    System.out.print("Enter Bytes: ");
                    value = sc.nextDouble();
                    result = value / 1024;
                    System.out.println("= " + result + " Kilobytes");
                }
                case 4 -> {
                    System.out.print("Enter Kilobytes: ");
                    value = sc.nextDouble();
                    result = value * 1024;
                    System.out.println("= " + result + " Bytes");
                }
                case 5 -> {
                    System.out.print("Enter Kilobytes: ");
                    value = sc.nextDouble();
                    result = value / 1024;
                    System.out.println("= " + result + " Megabytes");
                }
                case 6 -> {
                    System.out.print("Enter Megabytes: ");
                    value = sc.nextDouble();
                    result = value * 1024;
                    System.out.println("= " + result + " Kilobytes");
                }
                case 7 -> {
                    System.out.print("Enter Megabytes: ");
                    value = sc.nextDouble();
                    result = value / 1024;
                    System.out.println("= " + result + " Gigabytes");
                }
                case 8 -> {
                    System.out.print("Enter Gigabytes: ");
                    value = sc.nextDouble();
                    result = value * 1024;
                    System.out.println("= " + result + " Megabytes");
                }
                case 9 -> {
                    System.out.print("Enter Gigabytes: ");
                    value = sc.nextDouble();
                    result = value / 1024;
                    System.out.println("= " + result + " Terabytes");
                }
                case 10 -> {
                    System.out.print("Enter Terabytes: ");
                    value = sc.nextDouble();
                    result = value * 1024;
                    System.out.println("= " + result + " Gigabytes");
                }
                case 0 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
}
