package BItsManilulation;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class RightMostDefferentBit {

        public static int solve(int m, int n){
            int output = m ^ n;
//             1 0 1 1
//             1 0 0 1
//             0 0 1 0
// 0 0 0 1
            int i = 32;
            while(i-- > 0){
                if((output & 1) == 1){
                    return 32 - i;
                }
                output >>= 1;
            }
            return -1;
        }


        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int m = sc.nextInt();
                int n = sc.nextInt();
                System.out.println(solve(m, n));
            }
        }
}
