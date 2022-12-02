/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 01-12-2022
 */

package beginner;

import java.util.Scanner;

public class OlympicsRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int G1 = sc.nextInt();
            int S1 = sc.nextInt();
            int B1 = sc.nextInt();
            int G2 = sc.nextInt();
            int S2 = sc.nextInt();
            int B2 = sc.nextInt();
            if (G1 + S1 + B1 > G2 + S2 + B2)
                System.out.println(1);
            else
                System.out.println(2);
            T--;
        }
    }
}
