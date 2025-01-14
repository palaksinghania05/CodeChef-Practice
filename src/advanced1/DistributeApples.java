package advanced1;

import java.math.BigInteger;
import java.util.Scanner;

public class DistributeApples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            BigInteger N = sc.nextBigInteger();
            BigInteger K = sc.nextBigInteger();
            BigInteger temp = K.multiply(K);
            if (N.mod(temp).equals(BigInteger.ZERO))
                System.out.println("NO");
            else
                System.out.println("YES");
            T--;
        }
    }
}
