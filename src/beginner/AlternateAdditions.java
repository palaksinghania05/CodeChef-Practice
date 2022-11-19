/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 19-11-2022
 */

package beginner;

import java.util.Scanner;

public class AlternateAdditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = B - A;
            if (C % 3 == 2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            T--;
        }
    }
}
