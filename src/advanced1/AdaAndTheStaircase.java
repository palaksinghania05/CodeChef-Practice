package advanced1;

import java.util.Scanner;

public class AdaAndTheStaircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            long result = 0;
            int[] arr = new int[N + 1];
            arr[0] = 0;
            for (int i = 1; i <= N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 1; i <= N; i++) {
                if ((arr[i] - arr[i - 1]) > K)
                    result += (arr[i] - arr[i - 1] - 1) / K;
            }
            System.out.println(result);
            T--;
        }
    }
}
