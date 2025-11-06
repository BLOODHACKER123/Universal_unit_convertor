import java.util.Scanner;

public class Current {

        int ch;

        public Current() {
           Scanner sc= new Scanner(System.in);

            do {
                System.out.println("\n--- Electric Current Converter ---\n\n");
                System.out.println("--------------------------");
                System.out.println("1. Amperes (A) → Milliamperes (mA)");
                System.out.println("2. Milliamperes (mA) → Amperes (A)");
                System.out.println("3. Amperes (A) → Kiloamperes (kA)");
                System.out.println("4. Kiloamperes (kA) → Amperes (A)");
                System.out.println("5. Amperes (A) → Microamperes (µA)");
                System.out.println("6. Microamperes (µA) → Amperes (A)");
                System.out.println("0. Back to Main Menu");
                System.out.println("--------------------------");

                System.out.print("Enter your choice: ");
                ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.print("Enter current in Amperes: ");
                        double ampToMilli = sc.nextDouble();
                        System.out.println("Current in mA: " + (ampToMilli * 1000));
                        break;

                    case 2:
                        System.out.print("Enter current in Milliamperes: ");
                        double milliToAmp = sc.nextDouble();
                        System.out.println("Current in A: " + (milliToAmp / 1000));
                        break;

                    case 3:
                        System.out.print("Enter current in Amperes: ");
                        double ampToKilo = sc.nextDouble();
                        System.out.println("Current in kA: " + (ampToKilo / 1000));
                        break;

                    case 4:
                        System.out.print("Enter current in Kiloamperes: ");
                        double kiloToAmp = sc.nextDouble();
                        System.out.println("Current in A: " + (kiloToAmp * 1000));
                        break;

                    case 5:
                        System.out.print("Enter current in Amperes: ");
                        double ampToMicro = sc.nextDouble();
                        System.out.println("Current in µA: " + (ampToMicro * 1_000_000));
                        break;

                    case 6:
                        System.out.print("Enter current in Microamperes: ");
                        double microToAmp = sc.nextDouble();
                        System.out.println("Current in A: " + (microToAmp / 1_000_000));
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

