package advanced1;

import java.util.Scanner;

public class XORAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = 2 * sc.nextInt();
            }
            int result = 0;
            for (int i = 0; i < N; i++) {
                result ^= A[i];
            }
            System.out.println(result);
            T--;
        }
    }
}
