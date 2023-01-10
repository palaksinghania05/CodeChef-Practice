/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 07-01-2023
 */

package beginner;

import java.util.Scanner;

public class KeplersLaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int T1 = sc.nextInt();
            int T2 = sc.nextInt();
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();
            double planet1 = (1.0 * T1 * T1) / (R1 * R1 * R1);
            double planet2 = (1.0 * T2 * T2) / (R2 * R2 * R2);
            if (planet2 == planet1)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }

}
