/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 10-01-2023
 */

package beginner;

import java.util.Scanner;

public class DarkLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            if (K == 0) {
                if (N % 4 == 0) {
                    System.out.println("Off");
                } else {
                    System.out.println("On");
                }
            } else {
                if (N % 4 == 0) {
                    System.out.println("On");
                } else {
                    System.out.println("Ambiguous");
                }
            }
            T--;
        }
    }
}
