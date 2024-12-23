package advanced1;

import java.math.BigInteger;
import java.util.Scanner;

public class ObtainTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            BigInteger N = sc.nextBigInteger();
            BigInteger S = sc.nextBigInteger();
            BigInteger sum = N.multiply(N.add(BigInteger.ONE)).divide(BigInteger.TWO);
            BigInteger dif = sum.subtract(S);
            if (dif.compareTo(BigInteger.ONE) < 0)
                System.out.println(-1);
            else if (dif.compareTo(N) > 0)
                System.out.println(-1);
            else
                System.out.println(dif);
            T--;
        }
    }
}
