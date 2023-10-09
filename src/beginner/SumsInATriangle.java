package beginner;

import java.util.Scanner;

public class SumsInATriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int arr[][] = new int[N][N];
            for (int j = 0; j < N; j++)
                for (int k = 0; k <= j; k++)
                    arr[j][k] = sc.nextInt();
            for (int j = N - 2; j >= 0; j--) {
                for (int k = 0; k <= j; k++) {
                    arr[j][k] += Math.max(arr[j + 1][k], arr[j + 1][k + 1]);
                }
            }
            System.out.println(arr[0][0]);
            T--;
        }
    }
}
