package beginner2;

import java.util.Scanner;

public class MakeArrayOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- > 0) {
            long N = sc.nextLong();
            long X = sc.nextLong();
            long even = 0, odd = 0;
            for (long i = 0; i < N; i++) {
                long temp = sc.nextLong();
                if (temp % 2 != 0) odd++;
                else
                    even++;
            }
            if (X % 2 != 0) {
                if (even % 2 != 0)
                    System.out.println(even / 2 + 1);
                else
                    System.out.println(even / 2);
            } else {
                if (odd == 0)
                    System.out.println(-1);
                else {
                    System.out.println(even);
                }
            }
        }
    }
}
