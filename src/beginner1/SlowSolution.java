/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 14-01-2023
 */

package beginner1;

import java.util.Scanner;

public class SlowSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int maxT = sc.nextInt();
            int maxN = sc.nextInt();
            int sumN = sc.nextInt();
            int r = 0;
            int q = 0;
            if (sumN / maxN >= maxT) {
                System.out.println(maxT * maxN * maxN);
            } else if (sumN / maxN < maxT) {
                q = sumN / maxN;
                r = sumN % maxN;
                System.out.println(q * maxN * maxN + r * r);
            }
            T--;
        }
    }
}
