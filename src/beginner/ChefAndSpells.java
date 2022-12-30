/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 30-12-2022
 */

package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndSpells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int[] powers = new int[3];
            for (int i = 0; i < 3; i++) {
                powers[i] = sc.nextInt();
            }
            Arrays.sort(powers);
            System.out.println(powers[1] + powers[2]);
            T--;
        }
    }
}
