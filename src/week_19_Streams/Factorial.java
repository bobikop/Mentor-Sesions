package week_19_Streams;

import java.util.stream.LongStream;

public class Factorial {

    public static long factorialStreams( long n )
    {
        return LongStream.rangeClosed( 1, n )
                .reduce(1, ( long a, long b ) -> a * b);
    }


    public static void main(String[] args) {

      long factorialResult =   factorialStreams(12345);
        System.out.println(factorialResult);
    }
}
//    public static BigInteger getFactorial(int num) {
//        BigInteger result = BigInteger.ONE;
//        for (int i = 1; i <= num; i++)
//            result = result.multiply(BigInteger.valueOf(i));
//        return result;
//    }
