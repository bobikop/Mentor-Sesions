package Week_9;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "aabbccde";
        System.out.println(duplicatedLettersCount(str));

    }

    public static int duplicatedLettersCount(String str){

        str =  str.toLowerCase(); // to make sure that will se small lower and upper letters
        int dublicatedDigitCount = 0; // declare variable to catch our result

        for (char eachElement : str.toCharArray()) {

            if (str.substring(str.indexOf(eachElement) + 1).contains(eachElement+"")){
                dublicatedDigitCount++;
            }
            str = str.substring(str.indexOf(eachElement) + 1);
        }

        return dublicatedDigitCount;
    }
    }

