package beginner2;

import java.util.Scanner;

public class PositivePrefixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int count = 0;
            StringBuilder result = new StringBuilder();
            for (int i = 1; i <= N; i++) {
                if (K <= N / 2) {
                    if (i % 2 == 1 && count < K) {
                        result.append(i).append(" ");
                        count++;
                    } else
                        result.append(-1 * i).append(" ");
                } else {
                    if (i % 2 == 1 && count < N - K) {
                        result.append(-1 * i).append(" ");
                        count++;
                    } else
                        result.append(i).append(" ");
                }
            }
            System.out.println(result);
        }
    }
}
