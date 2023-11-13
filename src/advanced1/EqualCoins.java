package advanced1;

import java.util.Scanner;

public class EqualCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if ((X + 2 * Y) % 2 != 0 || (Y % 2 != 0 && X < 2)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            T--;
        }
    }
}
