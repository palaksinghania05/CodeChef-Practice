package advanced1;

import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            int count = 1;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    arr[j][i - j] = count++;
                }
            }
            for (int i = 1; i < N; i++) {
                for (int j = i; j < N; j++) {
                    arr[j][N - 1 + i - j] = count++;
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j]);
                    if (j < N - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            T--;
        }
    }
}
