package beginner2;

import java.util.Scanner;

public class MikeAndMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[][] A = new long[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextLong();
            }
        }
        long temp1 = 0;
        long temp2 = 0;
        int L = sc.nextInt();
        for (int i = 0; i < L; i++) {
            int row = sc.nextInt() - 1;
            int col = sc.nextInt() - 1;
            if (temp1 >= 0 && row < N && col < M) {
                temp1 += A[row][col];
            } else {
                temp1 = -1;
            }
            if (temp2 >= 0 && row < M && col < N) {
                temp2 += A[col][row];
            } else {
                temp2 = -1;
            }
        }
        System.out.println(Math.max(temp1, temp2));
    }
}
