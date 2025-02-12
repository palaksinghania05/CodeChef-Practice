package advanced1;

import java.util.Scanner;

public class NothingInCommon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int max = 0, count = 0;
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[M];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if (max < A[i])
                    max = A[i];
            }
            for (int i = 0; i < M; i++) {
                B[i] = sc.nextInt();
                if (max < B[i])
                    max = B[i];

            }
            int[] temp = new int[max + 1];
            for (int i = 0; i < N; i++) {
                temp[A[i]]++;
            }
            for (int i = 0; i < M; i++) {
                if (temp[B[i]] > 0)
                    count++;
            }
            System.out.println(count);
            T--;
        }
    }
}
