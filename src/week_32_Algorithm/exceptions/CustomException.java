package week_32_Algorithm.exceptions;

public class CustomException {
    public static void main(String[] args) throws AgeLessThenZeroException {

        validateAge(3);

    }


        public static void validateAge(int age) throws AgeLessThenZeroException {
            if (age <= 0){
                throw new AgeLessThenZeroException();
//                throw new AgeLessThenZeroException("Age cannot be negative", new RuntimeException());
            }

    }
}
