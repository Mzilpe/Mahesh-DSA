package com.company;

import java.util.Scanner;

public class Main {

    static double power(double x, int n) {
        double temp;
        if (n == 0)
            return 1;
        temp = power(x, n / 2);

        if (n % 2 == 0)
            return temp * temp;
        else {
            if (n > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }

    public static void main(String[] args) {
        //***************Merge Sort***************//
//        int arr[] = {18, 9, -7, 25, 85, 27, 5};
//        int length = arr.length-1;
//        MergeSort ms = new MergeSort();
//        ms.mergeSort(arr,0,length);
//
//        for(int i=0; i<length; i++){
//            System.out.print(arr[i]+" ");
//        }
        //***************Buy Sell stock***************//
//        int arr[] = {7,1,5,3,6,4};
//        BuySell bs = new BuySell();
//        System.out.println(bs.maxProfit(arr));

        //***************Reverse char array***************//

//        char s[] = {'h','e','l','l','o'};
//        Reverse r = new Reverse();
//        r.reverseString(s, 0, s.length-1);
//
//        for(int i=0; i<s.length;i++){
//            System.out.print(s[i]+" ");
        //       }
//***********Prime**//
     Prime p = new Prime();
//        p.isPrime(73);
//
//
//        System.out.println(p.isNumPrime(73));
//
//        p.printFactors(100);
//
      //p.printPrimeNum(997);
      //p.printPrimeNum2(997);
      System.out.println(p.segmentedSieve(100));
/////power Recursion********************
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        for (int i = 0; i < T; i++) {
//            double X = sc.nextDouble();
//            int N = sc.nextInt();
//
//            System.out.print(String.format("%.2f", power(X, N)));
//            System.out.println();
//        }



    }
}
