package beginner2;

import java.util.Arrays;
import java.util.Scanner;

public class BValentineCouples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++)
                A[i] = sc.nextInt();
            int[] B = new int[N];
            for (int i = 0; i < N; i++)
                B[i] = sc.nextInt();
            Arrays.sort(A);
            Arrays.sort(B);
            long result = 0;
            for (int i = 0; i < N; i++) {
                result = Math.max(A[i] + B[N - i - 1], result);
            }
            System.out.println(result);
        }
    }
}
