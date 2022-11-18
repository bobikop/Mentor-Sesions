package week_29_Algorithm.Practice;

public class Main {
    public static void main(String[] args) {



        Calculate s1 = (x1,x2) -> Calculator.findSum(x1,x2);
        s1.calculate(10,20);
        Calculate s2 = Calculator :: findSum;
        s2.calculate(12,5);



    }
}
