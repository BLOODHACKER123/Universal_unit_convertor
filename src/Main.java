import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===============================");
            System.out.println("     UNIVERSAL UNIT CONVERTER");
            System.out.println("===============================");

            System.out.println("\n--------------------------");
            System.out.println("1. Weight");
            System.out.println("2. Length");
            System.out.println("3. Current");
            System.out.println("4. Speed");
            System.out.println("5. Temperature");
            System.out.println("6. Volume");
            System.out.println("7. Area");
            System.out.println("8. Time");
            System.out.println("9. Energy");
            System.out.println("10. Power");
            System.out.println("11. Pressure");
            System.out.println("12. Force");
            System.out.println("13. Data");
            System.out.println("14. Angle");
            System.out.println("15. Currency");
            System.out.println("0. Exit");
            System.out.print("\nChoose what you want to convert: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: new Weight(); break;
                case 2: new Length(); break;
                case 3: new Current(); break;
                case 4: new Speed(); break;
                case 5: new Temperature(); break;
                case 6: new Volume(); break;
                case 7: new Area(); break;
                case 8: new Time(); break;
                case 9: new Energy(); break;
                case 10: new Power(); break;
                case 11: new Pressure(); break;
                case 12: new Force(); break;
                case 13: new Data(); break;
                case 14: new Angle(); break;
                case 15: new Currency(); break;
                case 0:
                    System.out.println("Exiting program... Goodbye!");
                    break;
                default:
                    System.out.println("⚠️ Invalid choice! Please try again.");
            }
        } while (choice != 0);

        input.close();
    }
}
