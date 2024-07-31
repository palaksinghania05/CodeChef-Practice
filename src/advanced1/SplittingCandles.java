package advanced1;

import java.util.Scanner;

public class SplittingCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextLong();
            long K = sc.nextLong();
            if (K != 0) {
                System.out.println(N / K + " " + N % K);
            } else {
                System.out.println(0 + " " + N);
            }
            T--;
        }
    }
}
