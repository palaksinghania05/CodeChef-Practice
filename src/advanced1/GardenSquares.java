package advanced1;

import java.util.Scanner;

public class GardenSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            char[][] arr = new char[N][M];
            for (int i = 0; i < N; i++) {
                String s = sc.next();
                for (int j = 0; j < M; j++)
                    arr[i][j] = s.charAt(j);
            }
            int ans = 0, k = 1;
            int min = Math.min(N, M);
            while (k < min) {
                for (int i = 0; i < N - k; i++) {
                    for (int j = 0; j < M - k; j++) {
                        char c = arr[i][j];
                        if (c == arr[i + k][j] && c == arr[i][j + k] && c == arr[i + k][j + k])
                            ans++;
                    }
                }
                k++;
            }
            System.out.println(ans);
            T--;
        }
    }
}
