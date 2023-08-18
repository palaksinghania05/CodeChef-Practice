package beginner1;

import java.util.Scanner;

public class Plus2OrMinus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int Y = sc.nextInt();
            if (Y == 0) {
                System.out.println(1);
            } else {
                System.out.println(3 * Y);
            }
            T--;
        }
    }
}
