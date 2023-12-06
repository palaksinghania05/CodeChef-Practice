package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class AdaAndDishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            boolean flag = true;
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println((int) Math.ceil(N / 2.0) * arr[0]);
            } else if (N == 2) {
                System.out.println((int) Math.max(arr[0], arr[1]));
            } else if (N == 3) {
                Arrays.sort(arr);
                System.out.println((int) Math.max(arr[0] + arr[1], arr[2]));
            } else {
                Arrays.sort(arr);
                int ans = (int) Math.min(Math.max(arr[1] + arr[2], arr[0] + arr[3]), Math.max(arr[0] + arr[1] + arr[2], arr[3]));
                System.out.println(ans);
            }
            T--;
        }
    }
}
