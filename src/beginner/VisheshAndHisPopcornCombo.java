/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 06-01-2023
 */

package beginner;

import java.util.Scanner;

public class VisheshAndHisPopcornCombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int result = 0;
            for (int i = 0; i < 3; i++) {
                result = Math.max(result, sc.nextInt() + sc.nextInt());
            }
            System.out.println(result);
            T--;
        }
    }
}
