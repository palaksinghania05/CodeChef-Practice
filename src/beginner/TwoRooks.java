/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-12-2022
 */

package beginner;

import java.util.Scanner;

public class TwoRooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();
            if (X1 == X2 || Y1 == Y2)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
