package advanced1;

import java.util.Scanner;

public class MinimumOrMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] B = new int[N];
            for (int i = 0; i < N; i++)
                B[i] = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            boolean flag = true;
            for (int i = 0; i < N; i++) {
                if (B[i] > max) {
                    max = B[i];
                }
                if (B[i] < min) {
                    min = B[i];
                }
                if (B[i] != min && B[i] != max) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
