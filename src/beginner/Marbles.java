/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 13-12-2022
 */

package beginner;

import java.util.Scanner;

public class Marbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long result = 1;
            for (int i = 1; i < k; i++) {
                result = result * (n - k + i) / i;
            }
            System.out.println(result);
            T--;
        }
    }
}
