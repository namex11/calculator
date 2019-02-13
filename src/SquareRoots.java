public class SquareRoots {

    private Calculator calculator;

    public SquareRoots() {
        this.calculator = new Calculator();
    }

    public double squareRoot(){
        double num = calculator.getNumbers().indexOf(0);
        return Math.sqrt(num);
    }

    public double squareNumber(int multiplier){
        double num = calculator.getNumbers().indexOf(0);
        return Math.pow(num, multiplier);
    }
}
