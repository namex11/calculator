public class ArithmeticOperations extends Calculator {

    public double addNumbers(){
        double answer = 0;
        addNumbersToList();
        for (Double number :
                getNumbers()) {
            answer += number;
        }
        resetList();
        return answer;
    }

    public double subtractNumbers(){
        double answer = 0;
        addNumbersToList();
        for (Double number:
            getNumbers()){
            answer -= number;
        }
        resetList();
        return answer;
    }

    public double multiplyNumbers(){
        double answer = 1;
        addNumbersToList();
        for (Double number :
                getNumbers()) {
            answer *=number;
        }
        resetList();
        return answer;
    }

    public double divideNumbers(){
        double answer = 0;
        addNumbersToList();
        for (Double number :
                getNumbers()) {
            if (notZero(number)){
                answer /= number;
            }else System.out.println("One of the numbers is 0, so the division is not possible.");
        }
        resetList();
        return answer;
    }

    public double remainder(double first, double second){
        return first % second;
    }
}
