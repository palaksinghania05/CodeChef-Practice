/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 31-01-2023
 */

package beginner1;

import java.util.Scanner;

public class CandyLove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int candies = 0;
            for (int i = 0; i < N; i++) {
                candies += sc.nextInt();
            }
            if (candies % 2 == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
