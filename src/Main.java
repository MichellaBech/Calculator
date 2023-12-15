package src;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double[] myNum = {10, 20, 30, 40};

        calculator.add(3);
        calculator.add(myNum);
        System.out.println(calculator.getResult());
        calculator.subtract(50);
        System.out.println(calculator.getResult());
        calculator.clear();
        System.out.println(calculator.getResult());
        System.out.println(calculator.max(10,11));
        System.out.println(calculator.min(34,3));
    }
}
