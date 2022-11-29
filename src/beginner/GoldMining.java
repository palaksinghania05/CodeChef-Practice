/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 27-11-2022
 */

package beginner;

import java.util.Scanner;

public class GoldMining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if ((N + 1) * Y >= X)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
