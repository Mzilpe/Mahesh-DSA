package Sorting;

import java.util.Scanner;

public class InsertionSort {
    static void insertionSortAscending(int arr[], int n) {

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }


    static void insertionSortDescending(int arr[], int n) {

        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]<temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= temp;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSortAscending(arr, size);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        insertionSortDescending(arr, size);

        for(int i=0; i<size; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
