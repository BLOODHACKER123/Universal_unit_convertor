import java.util.Scanner;

public class Temperature {
    int ch;

    public Temperature() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n--- Temperature Converter ---\n\n");
            System.out.println("--------------------------");
            System.out.println("1. Celsius → Fahrenheit");
            System.out.println("2. Fahrenheit → Celsius");
            System.out.println("3. Celsius → Kelvin");
            System.out.println("4. Kelvin → Celsius");
            System.out.println("5. Fahrenheit → Kelvin");
            System.out.println("6. Kelvin → Fahrenheit");
            System.out.println("0. Back to Main Menu");
            System.out.println("--------------------------\n");

            System.out.print("\nEnter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter temperature in °C: ");
                    double c = sc.nextDouble();
                    System.out.println("Temperature in °F: " + ((c * 9 / 5) + 32));
                    break;

                case 2:
                    System.out.print("Enter temperature in °F: ");
                    double f = sc.nextDouble();
                    System.out.println("Temperature in °C: " + ((f - 32) * 5 / 9));
                    break;

                case 3:
                    System.out.print("Enter temperature in °C: ");
                    double c1 = sc.nextDouble();
                    System.out.println("Temperature in K: " + (c1 + 273.15));
                    break;

                case 4:
                    System.out.print("Enter temperature in K: ");
                    double k = sc.nextDouble();
                    System.out.println("Temperature in °C: " + (k - 273.15));
                    break;

                case 5:
                    System.out.print("Enter temperature in °F: ");
                    double f1 = sc.nextDouble();
                    double kelvinFromF = (f1 - 32) * 5 / 9 + 273.15;
                    System.out.println("Temperature in K: " + kelvinFromF);
                    break;

                case 6:
                    System.out.print("Enter temperature in K: ");
                    double k1 = sc.nextDouble();
                    double fahrenheitFromK = (k1 - 273.15) * 9 / 5 + 32;
                    System.out.println("Temperature in °F: " + fahrenheitFromK);
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
