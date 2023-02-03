/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 20-01-2023
 */

package beginner1;

import java.util.Scanner;

public class BearAndCandies123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int limak = 0, bob = 0;
            int i = 1;
            String result = "";
            while (true) {
                if (i % 2 != 0) {
                    limak = limak + i;
                } else {
                    bob = bob + i;
                }
                if (limak > A) {
                    result = "Bob";
                    break;
                }
                if (bob > B) {
                    result = "Limak";
                    break;
                }
                i++;
            }
            System.out.println(result);
            T--;
        }
    }
}
