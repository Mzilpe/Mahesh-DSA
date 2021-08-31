package Arrays2D;
import java.util.*;
public class MountainArray {

    public static int longestMountain(int arr[], int n) {
        if (n < 3) {
            return 0;
        }

        int start = -1, end = -1;
        int ans = 0;

        for (int i = 0; i < n - 1; ++i) {
            if (arr[i + 1] > arr[i]) {
                if (end != -1) {
                    end = -1;
                    start = -1;
                }

                if (start == -1) {
                    start = i;
                }
            } else {
                if (arr[i + 1] < arr[i]) {
                    if (start != -1) {
                        end = i + 1;
                    }

                    if (end != -1 && start != -1) {
                        ans = Math.max(ans, end - start + 1);
                    }
                } else {
                    start = -1;
                    end = -1;
                }
            }
        }

        if (end != -1 && start != -1) {
            ans = Math.max(ans, end - start + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 6;
        //int arr[] = {1, 3, 1, 4};
        int arr[] = {1, 3, 1, 4, 3, 1};

        System.out.println(longestMountain(arr, 6));
    }
}
