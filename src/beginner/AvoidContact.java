package beginner;

import java.util.Scanner;

public class AvoidContact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (Y == 0)
                System.out.println(X);
            else if (X == Y)
                System.out.println(2 * X - 1);
            else {
                System.out.println((X - Y) + (Y * 2));
            }
            T--;
        }
    }
}
