package Sorting;

import java.util.Scanner;

public class MergeSort {

    public static void mergeSortAscending(int arr[], int left, int right) {

        if(left<right){
            int middle = (left+right)/2;
            mergeSortAscending(arr, left, middle);
            mergeSortAscending(arr, middle+1, right);
            merge(arr, left, middle, right);
        }
    }

    static void merge(int arr[], int left, int middle, int right){

        int n1 = middle-left+1;
        int n2 = right-middle;
        int leftArray[] = new int[n1];
        int rightArray[] = new int [n2];

        for(int i=0; i<n1; i++){
            leftArray[i]= arr[left+i];
        }
        for(int i=0; i<n2; i++){
            rightArray[i]= arr[middle+1+i];
        }
        int i=0, j=0, k=left;
        while(i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                arr[k++] = leftArray[i++];
            }else {
                arr[k++] = rightArray[j++];
            }
        }

        while(i<n1){
            arr[k++] = leftArray[i++];
        }
        while(j<n2){
            arr[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSortAscending(arr, 0, size-1);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

//        System.out.println();
//
//        mergeSortDescending(arr, size);
//
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
