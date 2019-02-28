public class SquareRoots  extends Calculator{

    public double squareRoot(){
        addNumbersToList();
        double num = getNumbers().indexOf(0);
        resetList();
        return Math.sqrt(num);
    }

    public double squareNumber(){
        addNumbersToList();
        double num = getNumbers().indexOf(0);
        double multiplier =getNumbers().indexOf(1);
        resetList();
        return Math.pow(num, multiplier);
    }

    @Override
    public void addNumbersToList() {
        System.out.println("Please input number or \n" +
                "number and multiplier");
        try {
            super.addNumbersToList();
        } catch (IndexOutOfBoundsException e){
            System.out.println("Ooops, you didnt entered enough numbers for a specific calculation :(");
        }

    }
}
