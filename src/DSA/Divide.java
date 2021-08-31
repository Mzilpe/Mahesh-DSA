package DSA;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class Divide {
        static void minMaxDigits(String str, int N)
        {
            int arr[] = new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = (str.charAt(i) - '0') % 3;

            int z = 0, on= 0, t = 0;
            for(int i = 0; i < N; i++)
            {
                if (arr[i] == 0)
                    z++;
                if (arr[i] == 1)
                    on++;
                if (arr[i] == 2)
                    t++;
            }
            int sum = 0;
            for(int i = 0; i < N; i++)
            {
                sum = (sum + arr[i]) % 3;
            }
            if (sum == 0)
            {
                System.out.print(0 + " ");
            }
            if (sum == 1)
            {
                if ((on != 0) && (N > 1))
                    System.out.print(1 + " ");
                else if (t > 1 && N > 2)
                    System.out.print(2 + " ");
                else
                    System.out.print(-1 + " ");
            }
            if (sum == 2)
            {
                if (t != 0 && N > 1)
                    System.out.print(1 + " ");
                else if (on > 1 && N > 2)
                    System.out.print(2 + " ");
                else
                    System.out.print(-1 + " ");
            }
        }
        public static void main (String[] args) {

            Scanner s = new Scanner(System.in);
            String str = s.nextLine();
            int N = str.length();
            minMaxDigits(str, N);
        }

}
