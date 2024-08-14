package advanced1;

import java.util.Scanner;

public class RemoveMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N, sum = 0, temp;
            N = sc.nextLong();
            int M = sc.nextInt();
            long[] A = new long[M];
            for (int i = 0; i < M; i++) {
                A[i] = sc.nextLong();
                sum += A[i];
            }
            temp = (N * (N + 1)) / 2;
            System.out.println(temp - sum);
            T--;
        }
    }
}
