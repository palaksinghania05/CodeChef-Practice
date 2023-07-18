package beginner1;

import java.util.Scanner;

public class TraceofMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int mat[][] = new int[N][N];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            int r = 0, c = 0;
            for (int i = 0; i < N; i++) {
                r = 0;
                c = i;
                int trace = 0;
                while (r < N && c < N) {
                    trace += mat[r][c];
                    max = Math.max(max, trace);
                    r++;
                    c++;
                }
            }
            for (int i = 1; i < N; i++) {
                r = i;
                c = 0;
                int trace = 0;
                while (r < N && c < N) {
                    trace += mat[r][c];
                    max = Math.max(max, trace);
                    r++;
                    c++;
                }
            }
            System.out.println(max);
            T--;
        }
    }
}
