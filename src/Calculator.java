import java.util.ArrayList;
import java.util.List;

public class Calculator {
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
}
