/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 31-12-2022
 */

package beginner;

import java.util.Scanner;

public class PlayPiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String s = sc.next();
            int f = 0;
            for (int i = 0; i < s.length() - 1; i += 2) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    f = 1;
                    break;
                }
            }
            if (f == 1)
                System.out.println("no");
            else
                System.out.println("yes");
            T--;
        }
    }
}
