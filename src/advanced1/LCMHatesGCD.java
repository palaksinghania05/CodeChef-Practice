package advanced1;

import java.util.Scanner;

public class LCMHatesGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            if (B % A == 0)
                System.out.println(0);
            else {
                long x = gcd(A, B);
                long LCM = (A * x) / gcd(A, x);
                long GCD = gcd(B, x);
                System.out.println(LCM - GCD);
            }
            T--;
        }
    }

    public static long gcd(long x, long y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }
}
