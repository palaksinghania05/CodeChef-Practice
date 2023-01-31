/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 25-01-2023
 */

package beginner1;

import java.util.Scanner;

public class WeightBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int w1 = sc.nextInt();
            int w2 = sc.nextInt();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int M = sc.nextInt();
            if ((w2 - w1) < (M * x1) || (w2 - w1) > (M * x2))
                System.out.println(0);
            else
                System.out.println(1);
            T--;
        }
    }
}
