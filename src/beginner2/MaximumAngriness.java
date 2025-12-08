package beginner2;

import java.util.Scanner;

public class MaximumAngriness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            long K = sc.nextLong();
            long temp1 = K * (K + 1) / 2;
            if (N / 2 <= K) {
                System.out.println(N * (N - 1) / 2);
            } else {
                long temp2 = (N * (N - 1) / 2) - ((N - K) * ((N - K) - 1) / 2);
                long temp3 = (N - (2 * (K)) - 1) * K;
                System.out.println(temp1 + temp2 + temp3);
            }
        }
    }
}
