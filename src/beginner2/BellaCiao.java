package beginner2;

import java.util.Scanner;

public class BellaCiao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long D = sc.nextLong();
            long d = sc.nextLong();
            long p = sc.nextLong();
            long Q = sc.nextLong();
            long temp1 = D / d;
            long temp2 = D % d;
            long temp3 = d * temp1 * (2 * p + (temp1 - 1) * Q) / 2;
            long temp4 = temp2 * (p + temp1 * Q);
            long result = temp3 + temp4;
            System.out.println(result);
        }
    }
}
