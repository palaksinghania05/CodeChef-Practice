/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-11-2022
 */

package beginner;

import java.util.Scanner;

public class GroupAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            System.out.println((2 * N + 1) - X);
            T--;
        }
    }
}
