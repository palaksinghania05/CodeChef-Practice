package advanced1;

import java.util.Scanner;

public class SplitAndMaximize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += sc.nextInt();
                sum %= 998244353;
            }
            long result = sum * (sum - 1) % 998244353;
            System.out.println(result);
            T--;
        }
    }
}
