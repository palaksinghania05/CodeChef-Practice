/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 13-12-2022
 */

package beginner;

import java.util.Scanner;

public class ShoeFit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A == 0 && B == 0 && C == 0)
                System.out.println(0);
            else if (A == 1 && B == 1 && C == 1)
                System.out.println(0);
            else
                System.out.println(1);
            T--;
        }
    }
}
