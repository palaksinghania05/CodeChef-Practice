/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 29-11-2022
 */

package beginner;

import java.util.Scanner;

public class ChefAndProfits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            System.out.println(X * Z - X * Y);
            T--;
        }
    }
}
