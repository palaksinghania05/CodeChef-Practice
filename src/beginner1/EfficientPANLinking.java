package beginner1;

import java.math.BigInteger;
import java.util.Scanner;

public class EfficientPANLinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            BigInteger N = sc.nextBigInteger();
            BigInteger c = N.mod(BigInteger.valueOf(20));
            System.out.println(c);
            T--;
        }
    }
}
