import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static Scanner scan = new Scanner(System.in);

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
                "11. Tg");
    }

    public static void menu(){
        boolean exit = false;

        while (exit){
            printmenu();

            int choice = scan.nextInt();
            try {
                switch (choice){
                    case 1:
                        ArithmeticOperations operations = new ArithmeticOperations();
                        System.out.println("Please enter numbers for addition or 0 to perform calculation");
                        double number;
                        while (number != 0){
                            number = scan.nextDouble();
                        }
                }
            } catch (InputMismatchException e){
                System.out.println("Error, please enter only integer or double values.");
            }

        }
    }
}
