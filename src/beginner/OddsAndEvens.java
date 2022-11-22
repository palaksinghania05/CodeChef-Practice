/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-11-2022
 */

package beginner;

import java.util.Scanner;

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a + b) % 2 == 0)
                System.out.println("Bob");
            else
                System.out.println("Alice");
            T--;
        }
    }
}
