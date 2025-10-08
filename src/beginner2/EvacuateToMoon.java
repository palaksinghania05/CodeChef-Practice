package beginner2;

import java.util.Arrays;
import java.util.Scanner;

public class EvacuateToMoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int H = sc.nextInt();
            int[] a = new int[N];
            long[] b = new long[M];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
            for (int j = 0; j < M; j++) {
                b[j] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            long result = 0;
            for (int j = 0; j < M; j++) {
                b[j] = b[j] * H;
            }
            for (int i = N - 1, j = M - 1; i >= 0 && j >= 0; i--, j--) {
                result += Math.min(a[i], b[j]);
            }
            System.out.println(result);
        }
    }
}
