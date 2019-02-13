public class Trigonometry {

    private Calculator calculator;

    public Trigonometry() {
        this.calculator = new Calculator();
    }

    public double sin(){
        return Math.sin(calculator.getNumbers().indexOf(0));
    }

    public double cos(){
        return Math.cos(calculator.getNumbers().indexOf(0));
    }

    public double tg(){
        return Math.tan(calculator.getNumbers().indexOf(0));
    }
}
