public class ArithmeticOperations extends Calculator {


    public double addNumbers(){
        double answer = 0;
        for (Double number :
                getNumbers()) {
            answer += number;
        }
        return answer;
    }

    public double subtractNumbers(){
        double answer = 0;
        for (Double number:
            getNumbers()){
            answer -= number;
        }
        return answer;
    }

    public double multiplyNumbers(){
        double answer = 0;
        for (Double number :
                getNumbers()) {
            answer *=number;
        }
        return answer;
    }

    public double divideNumbers(){
        double answer = 0;
        for (Double number :
                getNumbers()) {
            if (notZero(number)){
                answer /= number;
            }else System.out.println("One of the numbers is 0, so the division is not possible.");
        }
        return answer;
    }
}
