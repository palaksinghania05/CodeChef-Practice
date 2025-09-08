package beginner2;

import java.util.Scanner;

public class ControlThePollution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int result = (X) > (Y * 25) ? (N / 100) * 25 * Y : (N / 100) * X;
            N = N % 100;
            result = result + (Math.min((int) Math.ceil(N / 4.0) * Y, X));
            System.out.println(result);
        }
    }
}
