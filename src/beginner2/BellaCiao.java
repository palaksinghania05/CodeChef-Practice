package beginner2;

import java.util.Scanner;

public class BellaCiao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder result = new StringBuilder();
        while (T-- > 0) {
            long D = sc.nextInt(), d = sc.nextInt(), P = sc.nextInt(), Q = sc.nextInt(), temp1 = D / d, temp2 = D % d;
            result.append(D * P + temp1 * (temp1 - 1) / 2 * Q * d + temp2 * temp1 * Q).append("\n");
        }
        System.out.print(result);
    }
}
