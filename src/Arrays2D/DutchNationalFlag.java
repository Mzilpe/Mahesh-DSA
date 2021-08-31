package Arrays2D;

import java.util.Scanner;
//New changes
//Mahesh zilpe
public class DutchNationalFlag {
    static void sorts(int arr[]){
        int length = arr.length;
        int low=0;
        int high=length-1;
        int i=0;


        while(i<=high){
            if(arr[i]==0){
                int temp=arr[low];
                arr[low]=arr[i];
                arr[i] = temp;
                low++;
                i++;
            }else if(arr[i]==2) {
                int temp = arr[high];
                arr[high] = arr[i];
                arr[i]=temp;
                high--;
                i++;
            }else{
                i++;
            }
        }

    }

   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        sorts(arr);

        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
