package beginner2;

import java.util.Scanner;

public class AveragePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int M = N;
            for (int i = 0; i < N / 2; i++) {
                arr[i] = M;
                arr[N - i - 1] = M - 1;
                M = M - 2;
            }
            if (N % 2 != 0) {
                arr[N / 2] = 1;
            }

            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
