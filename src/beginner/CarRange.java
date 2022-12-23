/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-12-2022
 */

package beginner;

import java.util.Scanner;

public class CarRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int P = sc.nextInt();
            int M = sc.nextInt();
            int V = sc.nextInt();
            if (P == 1) {
                System.out.println(M * V);
            } else {
                System.out.println((M - P + 1) * V);
            }
            T--;
        }
    }
}
