/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 28-01-2023
 */

package beginner1;

import java.util.Scanner;

public class MinimumAttendanceRequirement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            int present = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1')
                    present++;
            }
            double percent = (double) (present + (120 - N)) * 100 / 120;
            if (percent >= 75)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
