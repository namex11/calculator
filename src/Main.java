import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
    public static Percent percent = new Percent();
    public static SquareRoots squareRoots = new SquareRoots();
    public static Trigonometry trigonometry = new Trigonometry();

    public static void main(String[] args) {
        menu();
        scan.close();
    }


    public static void printmenu(){
        System.out.println("\t \t \tCALCULATOR");
        System.out.println("\t What do you want to calculate?");
        System.out.println("\t Please enter option number:");
        System.out.println("1. Add numbers \n" +
                "2. Subtract \n" +
                "3. Multiply \n" +
                "4. Divide \n" +
                "5. Get remainder \n" +
                "6. Get percent \n" +
                "7. Square root \n" +
                "8. Square number \n" +
                "9. Sin \n" +
                "10. Cos \n" +
                "11. Tg \n" +
                "12. Exit the application");
    }

    public static void menu(){
        boolean exit = true;

        while (exit){
            printmenu();
            int choice;
            try {
                choice = scan.nextInt();
                switch (choice){
                    case 1:
                        roundNumber(arithmeticOperations.addNumbers());
                        break;
                    case 2:
                        roundNumber(arithmeticOperations.subtractNumbers());
                        break;
                    case 3:
                        roundNumber(arithmeticOperations.multiplyNumbers());
                        break;
                    case 4:
                        roundNumber(arithmeticOperations.divideNumbers());
                        break;
                    case 5:
                        roundNumber(arithmeticOperations.remainder());
                        break;
                    case 6:
                        roundNumber(percent.percent());
                        break;
                    case 7:
                        roundNumber(squareRoots.squareRoot());
                        break;
                    case 8:
                        roundNumber(squareRoots.squareNumber());
                        break;
                    case 9:
                        roundNumber(trigonometry.sin());
                        break;
                    case 10:
                        roundNumber(trigonometry.cos());
                        break;
                    case 11:
                        roundNumber(trigonometry.tg());
                        break;
                    case 12:
                        exit = false;
                        break;
                    default:
                        System.out.println("Theres no such option number in the menu.");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Error, please enter only integer or double values.");
            }

        }
    }

    private static void roundNumber(double number){
        System.out.print("Your answer is: ");
        System.out.format("%.4f", number);
        System.out.println();
        System.out.println();

    }

}
