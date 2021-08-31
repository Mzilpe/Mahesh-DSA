package Arrays2D;

import java.sql.SQLOutput;

public class TwoPointer {
    static void twoSum(int A[], int S){
    //   store the length of the array
    int n =A.length;
    int i = 0, j = n - 1;
    int ans[] = {-1, -1};
	while(i <=j) {
        int curSum =A[i]+A[j];
        if(curSum ==S) {
            ans[0] = i;
            ans[1]=  j;
            System.out.print(ans[0]+" "+ans[1]);
            break;
        }else if (curSum > S) {
            j -= 1;
        }
        else {
            i++;
        }
    }
}
    static void subArrayProduct(int a[], int p){
        int n = a.length;
        int i = 0, j = 0;
        int curP = 1;

        int ans  = Integer.MAX_VALUE;

        //   move the left pointer rightwards
        while(i < n) {
            while (j < n && curP < p) {
                curP *= a[j];
                j++;
            }
            //   we update the ans with the window length
            if (curP >= p) {
                ans = Math.min(ans, j - i);
            }

            //   move the left pointer and update its contribution to the product
            curP /= a[i];
            i++;
        }
        System.out.println(ans);
    }
    public static void main(String []args){
        //int n=6;
        int arr[] = {1, 2, 3, 4, 5, 6};
        int ar[] = {1, 2, 3, 4, 6};
        subArrayProduct(arr,20);
        twoSum(ar,6);
    }
}
