package beginner1;

import java.math.BigInteger;
import java.util.Scanner;

public class TheProductMystery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int B = sc.nextInt();
            int C = sc.nextInt();
            int temp = new BigInteger(String.valueOf(B)).gcd(new BigInteger(String.valueOf(C))).intValue();
            System.out.println(C / temp);
            T--;
        }
    }
}
