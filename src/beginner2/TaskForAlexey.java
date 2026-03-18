package beginner2;

import java.util.Scanner;

public class TaskForAlexey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++)
                A[i] = sc.nextLong();
            long min = Long.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    min = Math.min(min, ((A[i] * A[j]) / gcd(A[i], A[j])));
                }
            }
            System.out.println(min);
        }
    }

    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
