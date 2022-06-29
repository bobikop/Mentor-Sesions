package Week_9;

public class CharFrequency {
    public static void main(String[] args) {


        String str = "aabbcde";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // each character from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character

                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;
                }
            }

            System.out.println(ch + " : " + count);
        }

    }

}

