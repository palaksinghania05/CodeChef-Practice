/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-12-2022
 */

package beginner;

import java.util.Scanner;

public class ChefAndPairingSlippers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int L = sc.nextInt();
            int X = sc.nextInt();
            int result = N - L;
            int pair = result >= L ? L : result;
            System.out.println(pair * X);
            T--;
        }
    }
}
