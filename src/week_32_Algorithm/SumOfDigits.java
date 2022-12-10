package week_32_Algorithm;

public class SumOfDigits {

    // Recursion solution
    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10; // 123 %10 = 3, 12 % 10 = 2, 1 % 10 = 1 ..... 3+2+1 = 6
            num = num / 10;  // 123 / 10 = 12, 12/10 = 1
        }

        int result = 0;
        if (sum < 10) // 6 < 10
            result = sum; //result = 6
        else  result = sumOfDigits(sum); // call method again to get sum of two digits > 11
        return result;

    }

    public static void main(String[] args) {

        System.out.println(sumOfDigits(15555));

    }

}
