public class Percent {

    public Calculator calculator;

    public Percent() {
        this.calculator = new Calculator();
    }

    public double percent(double obtained, double total){
        return obtained * 100 / total;
    }
}
