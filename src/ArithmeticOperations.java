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
        addNumbersToList();
        double answer = getNumbers().get(0);

        for (Double number:
            getNumbers().subList(1, getNumbers().size())){
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
        addNumbersToList();
        double answer = getNumbers().get(0);

        for (Double number :
                getNumbers().subList(1, getNumbers().size())) {
            if (notZero(number)){
                answer /= number;
            }else System.out.println("One of the numbers is 0, so the division is not possible.");
        }
        resetList();
        return answer;
    }

    public double remainder(){
        System.out.println("Please input two numbers to get remainder");
        addNumbersToList();
        double first = getNumbers().get(0);
        double second = getNumbers().get(1);
        double result = first % second;
        resetList();
        return result;
    }
}
