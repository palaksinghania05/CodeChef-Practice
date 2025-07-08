package beginner2;

import java.util.Scanner;

public class ArrayHalves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long[] A = new long[2 * N];
            long temp = 0L, result = 0L;
            for (int i = 0; i < 2 * N; i++) {
                A[i] = sc.nextLong();
                if (A[i] > N)
                    temp++;
                else
                    result += temp;
            }
            System.out.println(result);
        }
    }
}
