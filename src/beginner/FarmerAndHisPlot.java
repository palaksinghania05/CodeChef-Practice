/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 20-12-2022
 */

package beginner;

import java.util.Scanner;

public class FarmerAndHisPlot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int L = sc.nextInt();
            int B = sc.nextInt();
            int squareSide = gcd(L, B);
            System.out.println((L * B) / (squareSide * squareSide));
            T--;
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
