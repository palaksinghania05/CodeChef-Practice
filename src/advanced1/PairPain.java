package advanced1;

import java.util.Scanner;

public class PairPain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long[] A = new long[N];
            long count1 = 1, count2 = 0;
            long result = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
                if (A[i] == 1) {
                    result += N - count1;
                    count1++;
                } else if (A[i] == 2)
                    count2++;
            }

            result += count2 * (count2 - 1) / 2;
            System.out.println(result);
            T--;
        }
    }
}
