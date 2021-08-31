package BItsManilulation;

import java.util.Scanner;

public class BItsConcepots {

    //To check the count of set bits 1's
    static int numSetBits(int A) {
        int count=0;
//        while(A > 0){
//            if((A&1) > 0){
//                count++;
//            }
//            count += A & 1;
            A >>= 1;
            //A = A>>1;
        //}
        while(A > 0){
            count++;
            A = A & (A-1);
        }
        return count;
    }
    // No of trailing zeroes
        public static int trailingZeros(int A) {
            int count=0;
            while( (A&1) == 0){
                count++;
                A = A>>1;
            }
            return count;
        }
    // to check ith bit ia set or not
    public static boolean ithSetBit(int n, int i){
        int f = 1;
        f = f << i;
        if((n & f) == 0){
            return false;
        }else{
            return true;
        }
    }

    // to check one non repeating number in an array
    static int nonRepeatNum(int arr[]){
        int result=0;
        for(int i=0; i< arr.length; i++){
            result = result ^ arr[i];
        }
        return result;
    }
    // to check two non repeating numbers
    static void nonRepeatNums(int arr[]){
        int result=0;
        for(int i=0; i< arr.length; i++){
            result = result ^ arr[i];
        }
        int lastSetBit = result & -result;
        //int lastSetBit = result & ~(result-1);
        int newA=0;
        int newB=0;
        for(int i=0; i<arr.length; i++){
            if((lastSetBit & arr[i]) != 0){
                newA = newA ^ arr[i];
            }else {
                newB = newB ^ arr[i];
            }
        }
        System.out.println(newA+" "+newB);
    }

    public static void main (String[] args) {
        int arr[] = {5, 5, 7, 7, 2};
        int arr1[] = {5, 5, 7, 7, 2, 3};
        System.out.println(nonRepeatNum(arr));
        nonRepeatNums(arr1);
        System.out.println(trailingZeros(10));
        System.out.println(numSetBits(10));
        System.out.println(ithSetBit(10, 1));


//        int result=0;
//        int newA=0;
//        int newB=0;
//        for(int i=0; i<arr.length; i++){
//            result = result ^ arr[i];
//            System.out.print(result+ " ");
//        }
//        System.out.println();
//        // To find the rightmost set bit of any number (gives the position from right)
////        int lastSetBit = result & ~(result-1);
//        int lastSetBit = result & -result;
//
//        for(int i=0; i<arr.length; i++){
//            if((lastSetBit & arr[i]) != 0){
//                newA = newA ^ arr[i];
//            }
//            else{
//                newB = newB ^ arr[i];
//            }
//        }
//        System.out.println(newA+" "+newB);
//        System.out.print(result+ " ");
////
////        System.out.print(result+ " ");
//


    }
}
