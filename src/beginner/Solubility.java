/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-12-2022
 */

package beginner;

import java.util.Scanner;

public class Solubility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println((A + (100 - X) * B) * 10);
            T--;
        }
    }
}
