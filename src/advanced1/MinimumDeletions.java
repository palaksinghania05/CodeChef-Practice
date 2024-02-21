package advanced1;

import java.util.Scanner;

public class MinimumDeletions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int gcd = 0;
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                int element = sc.nextInt();
                gcd = gcd(gcd, element);
            }
            if (gcd == 1) {
                System.out.println("0");
            } else {
                System.out.println("-1");
            }
            T--;
        }
    }

    public static int gcd(int x, int y) {
        while (y > 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return x;
    }
}
