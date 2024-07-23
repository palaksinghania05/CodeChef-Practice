package advanced1;

import java.util.Scanner;

public class AkashAndGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int temp1 = (N + 1);
            int temp2 = X + Y;
            if ((temp2 % 2 == 0 && temp1 % 2 == 0) || (temp2 % 2 != 0 && temp1 % 2 != 0)) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
            T--;
        }
    }
}
