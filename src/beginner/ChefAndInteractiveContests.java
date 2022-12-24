/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-12-2022
 */

package beginner;

import java.util.Scanner;

public class ChefAndInteractiveContests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = sc.nextInt();
        while (N > 0) {
            int R = sc.nextInt();
            if (R < r)
                System.out.println("Bad boi");
            else
                System.out.println("Good boi");
            N--;
        }
    }
}
