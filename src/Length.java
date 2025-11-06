import java.util.Scanner;

public class Length {
    int ch;

    public Length() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n--- Length Converter ---\n\n");
            System.out.println("--------------------------");
            System.out.println("1. Meters → Kilometers");
            System.out.println("2. Kilometers → Meters");
            System.out.println("3. Centimeters → Meters");
            System.out.println("4. Meters → Centimeters");
            System.out.println("5. Inches → Centimeters");
            System.out.println("6. Centimeters → Inches");
            System.out.println("7. Feet → Meters");
            System.out.println("8. Meters → Feet");
            System.out.println("0. Back to Main Menu");
            System.out.println("--------------------------\n");

            System.out.print("\nEnter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter length in meters: ");
                    double m = sc.nextDouble();
                    System.out.println("Length in kilometers: " + (m / 1000));
                    break;

                case 2:
                    System.out.print("Enter length in kilometers: ");
                    double km = sc.nextDouble();
                    System.out.println("Length in meters: " + (km * 1000));
                    break;

                case 3:
                    System.out.print("Enter length in centimeters: ");
                    double cm = sc.nextDouble();
                    System.out.println("Length in meters: " + (cm / 100));
                    break;

                case 4:
                    System.out.print("Enter length in meters: ");
                    double mToCm = sc.nextDouble();
                    System.out.println("Length in centimeters: " + (mToCm * 100));
                    break;

                case 5:
                    System.out.print("Enter length in inches: ");
                    double inch = sc.nextDouble();
                    System.out.println("Length in centimeters: " + (inch * 2.54));
                    break;

                case 6:
                    System.out.print("Enter length in centimeters: ");
                    double cmToInch = sc.nextDouble();
                    System.out.println("Length in inches: " + (cmToInch / 2.54));
                    break;

                case 7:
                    System.out.print("Enter length in feet: ");
                    double feet = sc.nextDouble();
                    System.out.println("Length in meters: " + (feet * 0.3048));
                    break;

                case 8:
                    System.out.print("Enter length in meters: ");
                    double meters = sc.nextDouble();
                    System.out.println("Length in feet: " + (meters / 0.3048));
                    break;

                case 0:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println("Enter a valid choice!");
            }

        } while (ch != 0);
    }
}
