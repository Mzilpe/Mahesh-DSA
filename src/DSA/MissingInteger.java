package DSA;
import java.util.*;


public class MissingInteger {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Boolean[] small=new Boolean[n+1];
        Arrays.fill(small,false);
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0&&arr[i]<n)
            {
                small[arr[i]]=true;
            }
            while(small[count]){
                count++;
            }
            System.out.println(count);
        }
    }

}
