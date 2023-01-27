/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 21-01-2023
 */

package beginner1;

import java.util.Scanner;

public class ElectionsInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A > 50)
                System.out.println('A');
            else if (B > 50)
                System.out.println('B');
            else if (C > 50)
                System.out.println('C');
            else
                System.out.println("NOTA");
            T--;
        }
    }
}
