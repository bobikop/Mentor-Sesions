package MentorSessions;

public class AnimalFeast {

    public static void main(String[] args) {


        if (isEligible("great american horn", "garlic naan")){
            System.out.println("This animal can brig the dish to the feast");
        }else {
            System.out.println("This animal is not allowed to bring dish to the feast");
        }

    }

    public  static boolean isEligible(String animalName, String dish){

        return animalName.charAt(0) == dish.charAt(0) && animalName.charAt(animalName.length() -1 ) == dish.charAt(dish.length()-1);
    }
}
