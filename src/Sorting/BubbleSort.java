package Sorting;

import java.util.Scanner;

public class BubbleSort {
    static void bubbleSortAscending(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }

    }
    static void bubbleSortDescending(int arr[], int n){
       for(int i=0; i<n-1; i++){
           int swap=0;
           for(int j=0; j<n-i-1; j++){
               if(arr[j]<arr[j+1]){
                   int temp = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = temp;
                   swap++;
               }
           }
           if(swap==0){
               break;
           }
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSortAscending(arr, size);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        bubbleSortDescending(arr, size);

        for(int i=0; i<size; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
