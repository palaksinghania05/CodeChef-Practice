/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 30-01-2023
 */

package beginner1;

import java.util.Scanner;

public class EqualCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int K = sc.nextInt();
            System.out.println(52 % K);
            T--;
        }
    }
}
