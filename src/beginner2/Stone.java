package beginner2;

import java.util.Scanner;

public class Stone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        if (K == 0) {
            K = 0;
        } else if (K % 2 == 0) {
            K = 2;
        } else {
            K = 1;
        }
        long[] arr = new long[(int) N];
        long max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }
        while (K-- > 0) {
            for (int i = 0; i < N; i++) {
                max = Math.max(max, arr[i]);
            }
            for (int i = 0; i < N; i++) {
                arr[i] = max - arr[i];
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
