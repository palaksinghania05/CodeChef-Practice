/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-12-2022
 */

package beginner;

import java.util.Scanner;

public class AkashAndMissingClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int result = N / 7;
            int remainder = N % 7;
            if (remainder == 6) {
                System.out.println(result + 1);
            } else {
                System.out.println(result);
            }
            T--;
        }
    }
}
