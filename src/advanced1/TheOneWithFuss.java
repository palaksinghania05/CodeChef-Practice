package advanced1;

import java.util.Scanner;

public class TheOneWithFuss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (Math.abs(A[i] - B[i]) <= K)
                    count++;
            }
            if (count >= X) {
                System.out.println("YES");
            } else
                System.out.println("NO");
            T--;
        }
    }
}
