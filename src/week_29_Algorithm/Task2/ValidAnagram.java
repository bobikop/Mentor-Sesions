package week_29_Algorithm.Task2;

import java.util.Arrays;

public class ValidAnagram {


    public static boolean isAnagram1(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        if (!Arrays.equals(S, T)) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "name";
        String t ="amen";


        System.out.println(isAnagram1(s,t));
    }
}





















//    public static boolean isAnagram(String s, String t) {
//
//        int a=s.length();
//        int b=t.length();
//
//        if(a!=b){
//            return false;
//        }
//
//        int[] arr=new int[26];
//
//        for(int i=0;i<a;i++){
//            char ch=s.charAt(i);
//            int index=ch-'a';
//            arr[index]++;
//        }
//        for(int i=0;i<b;i++){
//            char ch=t.charAt(i);
//            int index=ch-'a';
//            arr[index]--;
//        }
//        for(int i:arr){
//            if(i!=0){
//                return false;
//            }
//        }
//        return true;
//    }