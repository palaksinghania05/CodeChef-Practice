package advanced1;

import java.util.Scanner;

public class CacheHits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int B = sc.nextInt();
            int M = sc.nextInt();
            int[] arr = new int[M];
            for (int i = 0; i < M; i++) {
                arr[i] = sc.nextInt();
            }
            long result = 1;
            for (int i = 0; i < M - 1; i++) {
                if (arr[i] / B != arr[i + 1] / B)
                    result++;
            }
            System.out.println(result);
            T--;
        }
    }
}
