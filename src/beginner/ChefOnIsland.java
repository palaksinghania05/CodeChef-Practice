/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 25-11-2022
 */

package beginner;

import java.util.Scanner;

public class ChefOnIsland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int xr = sc.nextInt();
            int yr = sc.nextInt();
            int D = sc.nextInt();
            if (Math.min((x / xr), (y / yr)) < D)
                System.out.println("No");
            else
                System.out.println("Yes");
            T--;
        }
    }
}
