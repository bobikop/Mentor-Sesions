package week_08_foxTiefTask;

public class Fox {

      public String coatColor;
      public boolean wearsCoat;
      public boolean wearTorch;
      public int bagCount;


      public void setInfo(String coatColor, boolean wearsCoat, boolean wearTorch, int bagCount) {
            this.coatColor = coatColor;
            this.wearsCoat = wearsCoat;
            this.wearTorch = wearTorch;
            this.bagCount = bagCount;
      }

      public String toString() {
            return "fox{" +
                    "coatColor='" + coatColor + '\'' +
                    ", wearsCoat=" + wearsCoat +
                    ", wearTorch=" + wearTorch +
                    ", bagCount=" + bagCount +
                    '}';
      }

      public static String isSuspect(){
             String coatColor = "Black";
             boolean wearTorch = true;
             int bagCount = 3;

            if (coatColor.equals("BLACK") && wearTorch && bagCount == 3){
                  System.out.println("is one of suspects!");
            }else{
                  System.out.println("cleared of charges!");
            }

            return isSuspect();
      }

      public static void main(String[] args) {


            Fox fox1 = new Fox();
            fox1.setInfo("BLACK", true, true, 0);

            Fox fox2 = new Fox();
            fox2.setInfo("BLACK", true, true, 2);

            Fox fox3 = new Fox();
            fox3.setInfo("BLACK", true, true, 3);

            Fox fox4 = new Fox();
            fox4.setInfo("GRAY", false, true, 3);


            Fox[] allFoxes = {fox1, fox2, fox3, fox4};

             for( Fox fox : allFoxes){

             }




      }
}
