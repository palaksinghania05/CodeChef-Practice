package beginner2;

import java.util.Scanner;

public class PrimeSum {
    public static long gcd(long n, long m) {
        if (n % m == 0) return m;
        return gcd(m, n % m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            if (A == 1 || B == 1)
                System.out.println(-1);
            else {
                long temp = gcd(A, B);
                if (temp == 1)
                    System.out.println(1);
                else
                    System.out.println(0);
            }
        }
    }
}
