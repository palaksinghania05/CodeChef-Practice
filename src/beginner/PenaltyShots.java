/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 09-12-2022
 */

package beginner;

import java.util.Scanner;

public class PenaltyShots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }
            int teamA = 0, teamB = 0;
            for (int i = 0; i < 10; i++) {
                if (arr[i] == 1) {
                    if (i % 2 == 0)
                        teamA++;
                    else
                        teamB++;
                }
            }
            if (teamA > teamB)
                System.out.println(1);
            else if (teamB > teamA)
                System.out.println(2);
            else
                System.out.println(0);
            T--;
        }
    }
}
