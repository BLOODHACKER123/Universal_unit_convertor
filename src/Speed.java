import java.util.Scanner;

public class Speed {
    int ch;

    public Speed() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n--- Speed Converter ---\n\n");
            System.out.println("--------------------------");
            System.out.println("1. m/s → km/h");
            System.out.println("2. km/h → m/s");
            System.out.println("3. mph → km/h");
            System.out.println("4. km/h → mph");
            System.out.println("0. Back to Main Menu");
            System.out.println("--------------------------\n");

            System.out.print("\nEnter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter speed in m/s: ");
                    double ms = sc.nextDouble();
                    System.out.println("Speed in km/h: " + (ms * 3.6));
                    break;

                case 2:
                    System.out.print("Enter speed in km/h: ");
                    double kmh = sc.nextDouble();
                    System.out.println("Speed in m/s: " + (kmh / 3.6));
                    break;

                case 3:
                    System.out.print("Enter speed in mph: ");
                    double mph = sc.nextDouble();
                    System.out.println("Speed in km/h: " + (mph * 1.60934));
                    break;

                case 4:
                    System.out.print("Enter speed in km/h: ");
                    double kmhToMph = sc.nextDouble();
                    System.out.println("Speed in mph: " + (kmhToMph / 1.60934));
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
