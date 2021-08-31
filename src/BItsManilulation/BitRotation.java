package BItsManilulation;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class BitRotation {
        static boolean isRotation(long x, long y) {
            int i = 32;
            while (i-- > 0) {
                long lastBit = (x & 1); // 0 = 1 0 0 0   = 0
                x >>= 1; // 0 1 0 0
                x |= (lastBit << 31);  // 0 0 0 0 = 0 1 0 0 = 4
                if(x == y){
                    return true;
                }
            }
            return false;
        }

        // driver code to test above function
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str[] = br.readLine().strip().split(" ");
            long x = Long.parseLong(str[0]);
            long y = Long.parseLong(str[1]);

            if (isRotation(x, y)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

}
