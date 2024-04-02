package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndFixedDeposits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int sum = 0;
            int count = 0;
            boolean flag = false;
            for (int i = N - 1; i >= 0; i--) {
                sum += arr[i];
                count++;
                if (sum >= X) {
                    flag = true;
                    System.out.println(count);
                    break;
                }
            }
            if (!flag)
                System.out.println(-1);
            T--;
        }
    }
}
