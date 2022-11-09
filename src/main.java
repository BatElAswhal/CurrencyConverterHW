import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double EUR = 3.6850;
        double USD = 3.5260;
        Scanner scanner = new Scanner(System.in);
        int userSelection = 0;

        do {
            System.out.println("Welcome to Currency Converter program");
            System.out.println("Press  1 to convert ILS to USD");
            System.out.println("Press  2 to convert a USD to ILS ");
            System.out.println("Press  3 to convert a EUR to ILS");
            System.out.println("Press  4 to convert a ILS to EUR");
            System.out.println("press 0 to exit");

            double amount = 0;
            try{
            userSelection = scanner.nextInt();}
            catch (Exception err) {
                System.out.println("You must enter valid option");
                userSelection = 0;
            }

            if (userSelection == 1 || userSelection == 2 || userSelection == 3 || userSelection == 4) {
                System.out.println("Please enter the amount you want to convert:");
                try{
                    amount = scanner.nextDouble();}
                catch (Exception err) {
                    System.out.println("You must enter valid amount");
                    userSelection = 0;
                }
            }

            switch (userSelection) {
                case 1:
                    System.out.println("ILS to USD=" + amount / USD + '$');
                    break;
                case 2:
                    System.out.println("USD to ILS=" + amount * USD + '₪');
                    break;
                case 3:
                    System.out.println("EUR to ILS=" + amount * EUR + '₪');
                    break;
                case 4:
                    System.out.println("ILS to EUR=" + amount / EUR + '€');
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("You must to enter only valid option: 1-4 or zero to exit");

            }
        } while (userSelection != 0);

    }
}
