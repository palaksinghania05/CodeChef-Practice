package beginner2;

import java.util.Scanner;

public class AlternatingSubarrayPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++)
                A[i] = sc.nextInt();
            int[] B = new int[N];
            B[N - 1] = 1;
            for (int i = N - 2; i >= 0; i--) {
                int temp = Integer.signum(A[i]) + Integer.signum(A[i + 1]);
                if (temp == 0)
                    B[i] = B[i + 1] + 1;
                else
                    B[i] = 1;
            }
            for (int i = 0; i < N; i++)
                System.out.print(B[i] + " ");
            System.out.println();
        }
    }
}
