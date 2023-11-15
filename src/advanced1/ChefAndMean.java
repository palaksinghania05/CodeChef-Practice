package advanced1;

import java.util.Scanner;

public class ChefAndMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] coins = new int[N];
            long sum = 0;
            for (int i = 0; i < N; i++) {
                coins[i] = sc.nextInt();
                sum += coins[i];
            }
            double mean = (double) sum / N;
            boolean flag = false;
            int result = -1;
            for (int i = 0; i < N; i++) {
                if ((sum - coins[i]) / (double) (N - 1) == mean) {
                    flag = true;
                    result = i + 1;
                    break;
                }
            }
            if (flag) {
                System.out.println(result);
            } else {
                System.out.println("Impossible");
            }
            T--;
        }
    }
}
