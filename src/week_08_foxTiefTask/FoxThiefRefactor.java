package week_08_foxTiefTask;

public class FoxThiefRefactor {
        public static void main(String[] args) {
            String fox1CoatColor = "BLACK";
            String fox2CoatColor = "BLACK";
            String fox3CoatColor = "BLACK";
            String fox4CoatColor = "GRAY";

            boolean fox1WearsCoat = true;
            boolean fox2WearsCoat = true;
            boolean fox3WearsCoat = true;
            boolean fox4WearsCoat = false;

            boolean allHasATorch = true;

            int fox1BagCount = 0;
            int fox2BagCount = 2;
            int fox3BagCount = 3;
            int fox4BagCount = 3;

            if (fox1CoatColor.equals("BLACK") && allHasATorch && fox1BagCount == 3) {
                System.out.println(" Fox1 is one of suspects!");
            }else if (fox2CoatColor.equals("BLACK") && allHasATorch && fox2BagCount == 3){
                System.out.println(" Fox1 is one of suspects!");
            }else if (fox3CoatColor.equals("BLACK") && allHasATorch && fox3BagCount == 3) {
                System.out.println("Fox3 is one of suspects! ");
            }else if (fox4CoatColor.equals("BLACK") && allHasATorch && fox4BagCount == 3) {
                System.out.println("Fox4 is one of suspects!");
            }else{

                System.out.println("Fox4 cleared of charges!");
            }

        }

}
