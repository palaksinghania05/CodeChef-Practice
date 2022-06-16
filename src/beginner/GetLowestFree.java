/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-06-2022
 */

package beginner;

import java.util.Scanner;

public class GetLowestFree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int amount = Math.min(A, Math.min(B, C));
            System.out.println((A + B + C) - amount);
            T--;
        }
    }
}
