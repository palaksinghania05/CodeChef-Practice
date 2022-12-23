/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 23-12-2022
 */

package beginner;

import java.util.Scanner;

public class JanmanshAtFruitMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int min = Math.min(A, Math.min(B, C));
            int max = Math.max(A, Math.max(B, C));
            int mid = A + B + C - min - max;
            System.out.println(((X - 1) * min + mid));
            T--;
        }
    }
}
