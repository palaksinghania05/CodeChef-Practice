package advanced1;

import java.util.Scanner;

public class ChainReaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[N][M];
            int temp = 0, count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    temp = 0;
                    arr[i][j] = sc.nextInt();
                    if (i == 0 || i == N - 1) {
                        temp++;
                    } else {
                        temp += 2;
                    }
                    if (j == 0 || j == M - 1) {
                        temp++;
                    } else {
                        temp += 2;
                    }
                    if (temp <= arr[i][j]) {
                        count = 1;
                    }
                }
            }
            if (count == 1) {
                System.out.println("Unstable");
            } else {
                System.out.println("Stable");
            }
            T--;
        }
    }
}
