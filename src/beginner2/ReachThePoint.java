package beginner2;

import java.util.Scanner;

public class ReachThePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long X = Math.abs(sc.nextInt());
            long Y = Math.abs(sc.nextInt());
            long temp = Math.abs(X - Y);
            long result = 0;
            if (Y > X) {
                result = ((temp / 2) * 4 + (temp % 2) * 1) + 2 * X;
            } else if (X > Y) {
                result = ((temp / 2) * 4 + (temp % 2) * 3) + 2 * Y;
            } else {
                result = 2 * X;
            }
            System.out.println(result);
        }
    }
}
