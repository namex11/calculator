public class Trigonometry extends Calculator {

    public double sin(){
        addNumbersToList();
        double answer = Math.sin(getNumbers().indexOf(0));
        resetList();
        return answer;
    }

    public double cos(){
        addNumbersToList();
        double answer = Math.cos(getNumbers().indexOf(0));
        resetList();
        return answer;
    }

    public double tg(){
        addNumbersToList();
        double answer = Math.tan(getNumbers().indexOf(0));
        resetList();
        return answer;
    }

    @Override
    public void addNumbersToList() {
        System.out.println("Please input one number");
        super.addNumbersToList();
    }
}
