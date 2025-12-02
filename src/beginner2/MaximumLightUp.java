package beginner2;

import java.util.Scanner;

public class MaximumLightUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long P = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (((x * a) + b) < ((y * a) + c)) {
                System.out.println(P / ((x * a) + b));
            } else {
                System.out.println(P / ((y * a) + c));
            }
        }
    }
}
