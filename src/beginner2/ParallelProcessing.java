package beginner2;

import java.util.Scanner;

public class ParallelProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }
            if (N == 1) {
                System.out.println(A[0]);
            } else if (N == 2) {
                System.out.println(Math.max(A[0], A[1]));
            } else {
                long temp1 = A[0];
                long temp2 = A[N - 1];
                int i = 1;
                int j = N - 2;
                while (i <= j) {
                    if (temp1 <= temp2) {
                        temp1 += A[i];
                        i++;
                    } else {
                        temp2 += A[j];
                        j--;
                    }
                }
                System.out.println(Math.max(temp1, temp2));
            }
        }
    }
}
