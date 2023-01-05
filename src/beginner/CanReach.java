/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 05-01-2023
 */

package beginner;

import java.util.Scanner;

public class CanReach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int K = sc.nextInt();
            if (A % K == 0 && B % K == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
