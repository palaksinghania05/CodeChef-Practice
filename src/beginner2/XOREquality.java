package beginner2;

import java.math.BigInteger;
import java.util.Scanner;

public class XOREquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        final BigInteger TWO = BigInteger.valueOf(2);
        final BigInteger MOD = BigInteger.valueOf(1000000007);
        while (T-- > 0) {
            int N = sc.nextInt();
            BigInteger exponent = BigInteger.valueOf(N - 1);
            BigInteger result = TWO.modPow(exponent, MOD);
            System.out.println(result);
        }
        sc.close();
    }
}
