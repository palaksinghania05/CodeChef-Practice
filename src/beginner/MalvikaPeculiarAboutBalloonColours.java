/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-01-2023
 */

package beginner;

import java.util.Scanner;

public class MalvikaPeculiarAboutBalloonColours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String s = sc.next();
            int countA = 0, countB = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a')
                    countA++;
                else
                    countB++;
            }
            System.out.println(Math.min(countA, countB));
            T--;
        }
    }
}
