/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-11-2022
 */

package beginner;

import java.util.Scanner;

public class FindTheDirection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int mod = X % 4;
            if (mod == 1)
                System.out.println("East");
            else if (mod == 2)
                System.out.println("South");
            else if (mod == 3)
                System.out.println("West");
            else
                System.out.println("North");
            T--;
        }
    }
}
