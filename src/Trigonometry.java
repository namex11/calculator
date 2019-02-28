public class Trigonometry {

    private Calculator calculator;

    public Trigonometry() {
        this.calculator = new Calculator();
    }

    public double sin(){
        double answer = Math.sin(calculator.getNumbers().indexOf(0));
        calculator.resetList();
        return answer;
    }

    public double cos(){
        double answer = Math.cos(calculator.getNumbers().indexOf(0));
        calculator.resetList();
        return answer;
    }

    public double tg(){
        double answer = Math.tan(calculator.getNumbers().indexOf(0));
        calculator.resetList();
        return answer;
    }
}
