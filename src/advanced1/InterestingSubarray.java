package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class InterestingSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long[] A = new long[N];
            long temp = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
                temp = Math.max(temp, Math.abs(A[i]));
            }
            Arrays.sort(A);
            System.out.println(Math.min(A[0] * A[N - 1], Math.min(A[0] * A[0], A[N - 1] * A[N - 1])) + " " + temp * temp);
            T--;
        }
    }
}
