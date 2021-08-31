package com.company;

public class MergeSort {
    public static void mergeSort(int arr[], int left, int right){
            if(left<right){
                int middle = (left+right)/2;
                mergeSort(arr, left, middle);
                mergeSort(arr,middle+1, right );
                merge(arr, left, middle, right);
            }
    }

    public static void merge(int []arr, int left, int middle, int right){
        int n1 = middle-left+1;
        int n2 = right-middle;
        int leftArray[] = new int[n1];
        int rightArray[] = new int [n2];

        for(int i=0; i<n1; i++){
            leftArray[i]=arr[left+i];
        }
        for(int i=0; i<n2; i++){
            rightArray[i]=arr[middle+1+i];
        }

        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                arr[k++]=leftArray[i++];
            }else{
                arr[k++]=rightArray[j++];
            }
        }

        while(i<n1){
            arr[k++] = leftArray[i++];
        }
        while(j<n2){
            arr[k++] = rightArray[j++];
        }
    }
}
