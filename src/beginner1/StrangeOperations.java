package beginner1;

import java.util.Scanner;

public class StrangeOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N + K];
            int S = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                S += arr[i];
            }
            for (int i = N; i < N + K; i++) {
                arr[i] = S + 1;
                S += arr[i];
            }
            if (arr[N + K - 1] % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
            T--;
        }
    }
}
