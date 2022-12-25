/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 25-12-2022
 */

package beginner;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int D = sc.nextInt();
            int d = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (D * d >= 42)
                System.out.println(C);
            else if (D * d >= 21)
                System.out.println(B);
            else if (D * d >= 10)
                System.out.println(A);
            else
                System.out.println(0);
            T--;
        }
    }
}
