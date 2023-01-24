/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-01-2023
 */

package beginner1;

import java.util.Scanner;

public class AirlineRestrictions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int E = sc.nextInt();
            if ((A + B <= D && C <= E) || (B + C <= D && A <= E) || (A + C <= D && B <= E))
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
