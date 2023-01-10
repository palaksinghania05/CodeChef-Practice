/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 19-10-2022
 */

package beginner;

import java.util.Scanner;

public class LuckyFour {
    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while (T > 0) {
            String number = sc.next();
            int count = 0;
            for (int j = 0; j < number.length(); j++) {
                if (number.charAt(j) == '4') {
                    count++;
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
