/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 05-09-2022
 */

package beginner;

import java.util.Scanner;

public class MiamiGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(((X * 1.07) < Y) ? "NO" : "YES");
        }
    }
}
