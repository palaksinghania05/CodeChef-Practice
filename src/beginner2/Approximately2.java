package beginner2;

import java.util.Scanner;

public class Approximately2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }
            long min = Integer.MAX_VALUE;
            long temp = 0;
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (i != j) {
                        if (Math.abs(A[i] + A[j] - K) < min) {
                            min = Math.abs(A[i] + A[j] - K);
                            temp = 1;
                        } else if (Math.abs(A[i] + A[j] - K) == min)
                            temp++;
                    }
                }
            }
            System.out.println(min + " " + temp);
        }
    }
}
