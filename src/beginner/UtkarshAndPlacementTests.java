/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 28-11-2022
 */

package beginner;

import java.util.Scanner;

public class UtkarshAndPlacementTests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            char[] arr = new char[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.next().charAt(0);
            }
            char a = sc.next().charAt(0);
            char b = sc.next().charAt(0);

            for (int i = 0; i < 3; i++) {
                if (arr[i] == a) {
                    System.out.println(a);
                    break;
                }
                if (arr[i] == b) {
                    System.out.println(b);
                    break;
                }
            }
            T--;
        }
    }
}
