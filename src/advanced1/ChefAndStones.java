package advanced1;

import java.util.Scanner;

public class ChefAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N], B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            long result = 0;
            for (int i = 0; i < N; i++) {
                result = Math.max(result, (long) (K / A[i]) * B[i]);
            }
            System.out.println((long) result);
            T--;
        }
    }
}
