package beginner1;

import java.util.Scanner;

public class DownloadFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int result = 0;
            int[][] arr = new int[N][2];
            for (int i = 0; i < N; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                if (K >= arr[i][0]) {
                    K -= arr[i][0];
                } else {
                    arr[i][0] -= K;
                    result += arr[i][0] * arr[i][1];
                    K = 0;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
