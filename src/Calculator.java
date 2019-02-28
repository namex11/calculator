import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Calculator {
    private List<Double> numbers;

    public Calculator() {
        this.numbers = new ArrayList<>();
    }

    public boolean isPositive(double number){
        return number >= 0;
    }

    public boolean notZero(double number){
        return number != 0;
    }

    public List<Double> getNumbers() {
        return numbers;
    }

    public void resetList(){
        this.numbers.clear();
    }

    public void addNumbersToList(){
        System.out.println("Enter your numbers and press 0 to start calculation.");
        Scanner scan = new Scanner(System.in);
        double number;
        while (true){
            number = scan.nextDouble();
            if (number == 0){
                break;
            } else numbers.add(number);
        }
        System.out.println(numbers);
    }
}
