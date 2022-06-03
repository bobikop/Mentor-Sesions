package WeekSevenPractice;

public class OneToFiveTriangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 6-i ; j++) { // inner loop have a condition which depend on (i) value, and print every next line sorter for one number
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
