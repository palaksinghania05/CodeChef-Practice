package advanced1;

import java.util.Scanner;

public class FunnyHand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int result = 0;
            if (Math.abs(X - Y) == 1) {
                if (X == 1 || Y == 1 || X == N || Y == N) {
                    result = 1;
                } else {
                    result = 2;
                }
            } else if (Math.abs(X - Y) == 2) {
                result = 1;
            }
            System.out.println(result);
            T--;
        }
    }
}
