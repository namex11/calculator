public class Percent extends Calculator {

    public double percent(){
        addNumbersToList();
        double obtained = getNumbers().get(0);
        double total = getNumbers().get(1);
        double answer = obtained * 100 / total;
        resetList();
        return answer;
    }

    @Override
    public void addNumbersToList() {
        System.out.println("Please enter two numbers for percentage operation, first - obtained, second - total.");
        super.addNumbersToList();
    }
}
