package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            long result = A[0];
            for (int i = 0; i < N - 1; i++) {
                int temp = 0;
                if (A[i + 1] % A[i] == 0) {
                    temp = A[i];
                } else {
                    temp = A[i + 1] % A[i];
                }
                if (result > temp) {
                    result = temp;
                }
            }
            System.out.println(result * N);
            T--;
        }
    }
}
