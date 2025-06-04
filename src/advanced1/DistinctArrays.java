package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class DistinctArrays {
    static final int MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            long result = 1;
            for (int i = 0; i < N; i++) {
                int temp = A[i] - i;
                if (temp <= 0) {
                    result = 0;
                    break;
                }
                result = (result * temp) % MOD;
            }
            System.out.println(result);
        }
    }
}
