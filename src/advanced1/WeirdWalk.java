package advanced1;

import java.util.Scanner;

public class WeirdWalk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++)
                A[i] = sc.nextInt();
            for (int i = 0; i < N; i++)
                B[i] = sc.nextInt();
            int sum1 = 0, sum2 = 0;
            long result = 0;
            for (int i = 0; i < N; i++) {
                if (sum1 == sum2 && A[i] == B[i]) {
                    result += A[i];
                }
                sum1 += A[i];
                sum2 += B[i];
            }
            System.out.println(result);
            T--;
        }
    }
}
