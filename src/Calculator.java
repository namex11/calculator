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
        Scanner scan = new Scanner(System.in);
        double number;
        while (scan.hasNext()){
            number = scan.nextDouble();
            numbers.add(number);
        }
        System.out.println(numbers);
        scan.close();
    }
}
