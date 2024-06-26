package advanced1;

import java.util.Scanner;

public class GreedyPuppy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextLong();
            long K = sc.nextLong();
            long max = 0;
            for (int i = 1; i <= K; i++) {
                long mod = N % i;
                max = Math.max(max, mod);
            }
            System.out.println(max);
            T--;
        }
    }
}
