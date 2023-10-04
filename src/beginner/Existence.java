package beginner;

import java.util.Scanner;

public class Existence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long res1 = (X * X * X * X) + 4 * (Y * Y);
            long res2 = (4 * (X * X) * Y);
            if (res1 == res2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
