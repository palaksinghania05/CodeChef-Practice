package beginner2;

import java.util.Scanner;

public class MissingSomeChairs {
    static final long MOD = 1000000007;

    // Fast modular exponentiation
    static long powmod(long a, long b, long mod) {
        long result = 1;
        a = a % mod;
        while (b > 0) {
            if ((b & 1) == 1) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            long N = sc.nextLong();
            long ans = (powmod(2, N, MOD) - 1 + MOD) % MOD;
            System.out.println(ans);
        }

        sc.close();
    }
}
