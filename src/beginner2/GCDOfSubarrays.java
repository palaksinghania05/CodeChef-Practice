package beginner2;

import java.util.Scanner;

public class GCDOfSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            long totalSubArrays = (long) N * (N + 1) / 2;
            if (totalSubArrays > K) {
                System.out.println(-1);
            } else {
                StringBuilder S = new StringBuilder();
                for (int i = 1; i < N; i++) {
                    S.append("1");
                    S.append(" ");
                }
                long result = K - totalSubArrays + 1;
                S.append(result);
                System.out.println(S);
            }
        }
    }
}
