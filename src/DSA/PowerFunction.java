package DSA;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class PowerFunction
{

    class Main {
        static double power(double x, int n){
            double temp;
            if (n == 0)
                return 1;
            temp = power(x, n / 2);

            if (n % 2 == 0)
                return temp * temp;
            else {
                if (n > 0)
                    return x * temp * temp;
                else
                    return (temp * temp) / x;
            }

        }
        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            for(int i=0;i<T;i++){
                double X=sc.nextDouble();
                int N=sc.nextInt();

                System.out.print(String.format("%.2f",power(X,N)));
                System.out.println();        // Your code here
            }
        }
    }

}
