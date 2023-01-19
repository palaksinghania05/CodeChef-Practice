/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 19-01-2023
 */

package beginner1;

import java.util.Scanner;

public class PackagingCupcakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println((N / 2) + 1);
            T--;
        }
    }
}
