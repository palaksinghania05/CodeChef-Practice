package advanced1;

import java.util.Scanner;

public class CrazyBishopsOnChessboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if (N <= 2) {
                System.out.println(0);
            } else {
                if (N % 2 == 1) {
                    System.out.println((3 * (N / 2)) - 1);

                } else {
                    System.out.println((3 * (N / 2)) - 3);
                }
            }
        }
    }
}
