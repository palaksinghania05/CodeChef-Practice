package beginner2;

import java.util.Scanner;

public class SumQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        while (M-- > 0) {
            long q = sc.nextLong();
            if (q < N + 2 || q > 3 * N) {
                System.out.println(0);
            } else {
                System.out.println(N - Math.abs((2 * N + 1) - q));
            }
        }
    }
}
