package advanced1;

import java.util.Scanner;

public class SubtractionGame1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int result = arr[0];
            for (int i = 1; i < N; i++) {
                result = GCD(result, arr[i]);
            }
            System.out.println(result);
            T--;
        }
    }

    private static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}
