package week_27_Algorithm.Task2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Tickets {
    public static void main(String[] args) {

//        PriorityQueue myQ = new PriorityQueue();
//
//        myQ.add(45);
//        myQ.add(2);
//        myQ.add(23);
//        myQ.add(11);
//        myQ.add(1);
//

//        System.out.println(myQ);
//        while(!myQ.isEmpty()){
//            System.out.println(myQ.remove());
//        }

        int k = 2;
        int[] tickets = {2,3,2};



        System.out.println(timeRequiredToBuy1(tickets,k));







    }

    //---------------------------------------------------------------------------------------------------------------//
    //solution 1
    public static int timeRequiredToBuy1(int[] tickets, int k) {
        int time = 0;

        while (tickets[k] !=0){
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[k] == 0){
                    break;
                }
                if (tickets[i] !=0){
                    tickets[i] -= 1;
                    time++;
                }
            }
        }
        return  time;
    }





    //---------------------------------------------------------------------------------------------------------------//
    //solution 2
    public int timeRequiredToBuy2(int[] tickets, int k) {
        int time = 0;
        Deque<int[]> queue = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            queue.addLast(new int[]{tickets[i], i});
        }
        while (!queue.isEmpty()) {
            int[] curr = queue.pollFirst();
            if (curr[0] - 1 > 0) {
                queue.addLast(new int[]{curr[0] - 1, curr[1]});
            }
            time++;
            if (curr[1] == k && curr[0] - 1 == 0) {
                return time;
            }
        }
        return time;
    }
}


















//---------------------------------------------------------------------------------------------------------------//
//    //solution 1
//
//    public int timeRequiredToBuy(int[] tickets, int k) {
//        int result = 0;
//        for (int i = 0; i< tickets.length;i++){
//            if (i<=k){
//                result = result + Math.min(tickets[k],tickets[i]);
//            }else{
//                result = result + Math.min(tickets[k]-1,tickets[i] );
//            }
//
//        }
//        return  result;
//    }


//---------------------------------------------------------------------------------------------------------------//
