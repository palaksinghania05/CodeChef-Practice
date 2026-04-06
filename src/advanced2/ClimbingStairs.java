package advanced2;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        long[] A = new long[1000001];
        A[1] = A[0] = 1L;
        long M = (long) 1e9 + 7;
        for (int i = 2; i <= 1000000; i++) {
            A[i] = (A[i - 1] + A[i - 2]) % M;
        }
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int Q = sc.nextInt();
            long temp = A[N];
            while (temp != 0) {
                if ((temp & 1) != 0) {
                    Q--;
                }
                temp = temp >> 1;
            }
            System.out.println(Q == 0 ? "CORRECT" : "INCORRECT");
        }
    }
}
