package beginner1;

import java.util.Arrays;
import java.util.Scanner;

public class LazySalesman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int W = sc.nextInt();
            int nums[] = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = sc.nextInt();
            }
            Arrays.sort(nums);
            int wages = 0;
            int count = 0;
            for (int i = N - 1; i >= 0; i--) {
                wages += nums[i];
                count++;
                if (wages >= W)
                    break;
            }
            System.out.println(N - count);
            T--;
        }
    }
}
