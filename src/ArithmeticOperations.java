public class ArithmeticOperations {

    private Calculator calculator;

    public ArithmeticOperations() {
        this.calculator = new Calculator();
    }

    public double addNumbers(){
        double answer = 0;
        for (Double number :
                calculator.getNumbers()) {
            answer += number;
        }
        return answer;
    }

    public double subtractNumbers(){
        double answer = 0;
        for (Double number:
            calculator.getNumbers()){
            answer -= number;
        }
        return answer;
    }

    public double multiplyNumbers(){
        double answer = 0;
        for (Double number :
                calculator.getNumbers()) {
            answer *=number;
        }
        return answer;
    }

    public double divideNumbers(){
        double answer = 0;
        for (Double number :
                calculator.getNumbers()) {
            if (calculator.notZero(number)){
                answer /= number;
            }else System.out.println("One of the numbers is 0, so the division is not possible.");
        }
        return answer;
    }

    public double remainder(double first, double second){
        return first%second;
    }
}
