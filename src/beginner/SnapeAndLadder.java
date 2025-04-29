package beginner;

import java.util.Scanner;

public class SnapeAndLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            double X = sc.nextInt();
            double Y = sc.nextInt();
            double min = Math.sqrt(Math.abs(X * X - Y * Y));
            double max = Math.sqrt(X * X + Y * Y);
            System.out.println(min + " " + max);
        }
    }
}
