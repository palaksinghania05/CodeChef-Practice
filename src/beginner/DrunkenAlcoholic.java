/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 25-11-2022
 */

package beginner;

import java.util.Scanner;

public class DrunkenAlcoholic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            if (X == 0)
                System.out.println(0);
            else if (X % 2 == 0)
                System.out.println(X);
            else
                System.out.println(X + 2);
            T--;
        }
    }
}
