package Sorting;

import java.util.Scanner;

public class Selection {

    static void selectionSortAscending(int arr[], int n){

         for(int i=n-1; i>0; i--) {
             int maxIndex = i;
             for(int j=0; j<i; j++){
                 if (arr[j] > arr[maxIndex]) {
                     maxIndex=j;
                 }
             }
             if(maxIndex!=i){
                 int temp = arr[i];
                 arr[i] = arr[maxIndex];
                 arr[maxIndex]= temp;
             }
         }
    }
    static void selectionSortDescending(int arr[], int n){
        for(int i=n-1; i>0; i--){
            int minIndex = i;
            for(int j=0; j<i; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        selectionSortAscending(arr, size);

        for(int i=0; i<size; i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();

        selectionSortDescending(arr, size);

        for(int i=0; i<size; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
