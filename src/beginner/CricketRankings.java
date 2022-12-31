/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 31-12-2022
 */

package beginner;

import java.util.Scanner;

public class CricketRankings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int R1 = sc.nextInt();
            int W1 = sc.nextInt();
            int C1 = sc.nextInt();
            int R2 = sc.nextInt();
            int W2 = sc.nextInt();
            int C2 = sc.nextInt();
            int A = 0, B = 0;
            if (R1 > R2) {
                A++;
            } else {
                B++;
            }
            if (W1 > W2) {
                A++;
            } else {
                B++;
            }
            if (C1 > C2) {
                A++;
            } else {
                B++;
            }
            if (A > B)
                System.out.println('A');
            else
                System.out.println('B');
            T--;
        }
    }
}
