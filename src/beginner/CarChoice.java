/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-11-2022
 */

package beginner;

import java.util.Scanner;

public class CarChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            double car1 = (double) y1 / x1;
            double car2 = (double) y2 / x2;
            if (car1 < car2)
                System.out.println(-1);
            else if (car1 > car2)
                System.out.println(1);
            else
                System.out.println(0);
            T--;
        }
    }
}
