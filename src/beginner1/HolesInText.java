/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 19-02-2023
 */

package beginner1;

import java.util.Scanner;

public class HolesInText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String s = sc.next();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A' || s.charAt(i) == 'D' || s.charAt(i) == 'O' || s.charAt(i) == 'P' || s.charAt(i) == 'R' || s.charAt(i) == 'Q') {
                    count++;
                } else if (s.charAt(i) == 'B')
                    count = count + 2;
            }
            System.out.println(count);
            T--;
        }
    }
}
