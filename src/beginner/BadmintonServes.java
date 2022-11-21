/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 21-11-2022
 */

package beginner;

import java.util.Scanner;

public class BadmintonServes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int P = sc.nextInt();
            System.out.println((P / 2) + 1);
            T--;
        }
    }
}
