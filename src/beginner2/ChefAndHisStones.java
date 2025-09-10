package beginner2;

import java.util.Scanner;

public class ChefAndHisStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long N = sc.nextLong();
            long sum = (N * (N + 1)) / 2;
            long diff = Math.abs(X - Y);
            if (Math.min(X, Y) < sum) {
                System.out.println(diff);
            } else {
                System.out.println(X + Y - (2 * sum));
            }
        }
    }
}
