package Week_9;

public class RepeatingCharacters {
    public static void main(String[] args) {

       String str ="aabbbcde";

       int count = 0;

       char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1 ; j < ch.length; j++) {
                if(ch[i] == ch[j]){

                    System.out.println("Repeating characters are: " + ch[j] );
                    count++;

                }
            }
        }


        System.out.println("Repeating characters count: " + count);

    }
}
