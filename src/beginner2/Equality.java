package beginner2;

import java.util.Scanner;

public class Equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++)
                A[i] = sc.nextLong();
            if (N == 2) {
                System.out.println(A[1] + " " + A[0]);
            } else {
                long sum = 0;
                for (int i = 1; i < N - 1; i++) {
                    sum += (A[0] - A[i]);
                }
                sum = A[N - 1] - sum;
                sum /= (N - 1);
                System.out.print(sum + " ");
                for (int i = 1; i < N; i++) {
                    System.out.print((A[0] - A[i] + sum) + " ");
                }
                System.out.println();
            }
        }
    }
}
