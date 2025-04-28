package advanced1;

import java.util.Scanner;

public class MinimumNumberOfFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int sum = 0;
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
                sum = sum + arr[j];
            }
            if (sum % 2 == 0) {
                System.out.println(Math.abs(sum / 2));
            } else {
                System.out.println(-1);
            }
        }
    }
}
