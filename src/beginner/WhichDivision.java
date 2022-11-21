/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 21-11-2022
 */

package beginner;

import java.util.Scanner;

public class WhichDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int R = sc.nextInt();
            if (R >= 2000)
                System.out.println(1);
            else if (R >= 1600 && R < 2000)
                System.out.println(2);
            else
                System.out.println(3);
            T--;
        }
    }
}
