package MentorSessions;

public class TaskVowe {
    public static void main(String[] args) {


        String str = "bbddaafffe";
        //            012345678910

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if(current == 'a' || current == 'e'|| current == 'i'|| current == 'u'){
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if(current == str.charAt(j)){
                        count++;
                    }
                }
                if(count ==1 ){
                    System.out.println(i);
                    return;
                }
            }

        } // outer loop
        System.out.println("-1");

    }
}
