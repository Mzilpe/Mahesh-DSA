package Arrays2D;
import java.util.*;
import java.lang.*;

public class Array2D {


        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Rows");
            int rows = sc.nextInt();
            System.out.println("Enter cols");
            int cols = sc.nextInt();
            int arr[][] = new int[rows][cols];
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    System.out.println("a["+i+"]["+j+"]");
                    arr[i][j]=sc.nextInt();
                }
            }
//Matrix itself
//            C = 100;
//            for i = 1 to n do
//                for j = 1 to n do
//                Temp = A[i][j] + C;
//            A[i][j] = A[j][i];
//            A[j][i] = Temp - C;
//
//
//            for i = 1 to n do
//                for j = 1 to n do
//                Output(A[i][j]);

            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    System.out.println(arr[i][j]);
                }
            }
        }
}
