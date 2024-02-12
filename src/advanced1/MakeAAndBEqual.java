package advanced1;

import java.util.Scanner;

public class MakeAAndBEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long sum1 = 0, sum2 = 0;
            long[] A = new long[N];
            long[] B = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }
            for (int j = 0; j < N; j++) {
                B[j] = sc.nextLong();
                if (B[j] > A[j]) {
                    sum1 = sum1 + (B[j] - A[j]);
                } else {
                    sum2 = sum2 + (A[j] - B[j]);
                }
            }
            if (sum1 == sum2) {
                System.out.println(sum1);
            } else {
                System.out.println("-1");
            }
            T--;
        }
    }
}
