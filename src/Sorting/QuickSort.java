package Sorting;

import java.util.Scanner;

public class QuickSort {

    public static void quickSortAscending(int arr[], int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSortAscending(arr, left, pivot - 1);
            quickSortAscending(arr, pivot + 1, right);
        }
    }
    static int partition(int arr[], int left, int right){
        int pivot = arr[right];
        int i = (left - 1);

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return (i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        quickSortAscending(arr, 0, size - 1);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
