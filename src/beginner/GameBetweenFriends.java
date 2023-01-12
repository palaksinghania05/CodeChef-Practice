/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-01-2023
 */

package beginner;

import java.util.Scanner;

public class GameBetweenFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            if (B > A) {
                if (B > A + C) {
                    if (B > A + C + D)
                        System.out.println('S');
                    else
                        System.out.println('N');
                } else {
                    if (B + D > A + C)
                        System.out.println('S');
                    else
                        System.out.println('N');
                }
            } else {
                if (B + C > A) {
                    if (B + C > A + D)
                        System.out.println('S');
                    else
                        System.out.println('N');
                } else {
                    if (B + C + D > A)
                        System.out.println('S');
                    else
                        System.out.println('N');
                }
            }
            T--;
        }
    }
}
