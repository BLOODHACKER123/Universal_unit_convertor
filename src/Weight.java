import java.util.Scanner;

public class Weight {
    int ch;

    public Weight() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n--- Weight Converter ---\n\n");
            System.out.println("--------------------------");
            System.out.println("1. lbs → kg");
            System.out.println("2. kg → lbs");
            System.out.println("3. g → kg");
            System.out.println("4. kg → g");
            System.out.println("0. Back to Main Menu");
            System.out.println("--------------------------\n");

            System.out.print("\nEnter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter weight in lbs: ");
                    double weightLbs = sc.nextDouble();
                    double kg = weightLbs * 0.453592;
                    System.out.println("Weight in kg: " + kg);
                    break;

                case 2:
                    System.out.print("Enter weight in kg: ");
                    double weightKg = sc.nextDouble();
                    double lbs = weightKg / 0.453592;
                    System.out.println("Weight in lbs: " + lbs);
                    break;

                case 3:
                    System.out.print("Enter weight in grams: ");
                    double g = sc.nextDouble();
                    double kgFromG = g / 1000;
                    System.out.println("Weight in kg: " + kgFromG);
                    break;

                case 4:
                    System.out.print("Enter weight in kg: ");
                    double kgToG = sc.nextDouble();
                    double grams = kgToG * 1000;
                    System.out.println("Weight in grams: " + grams);
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
