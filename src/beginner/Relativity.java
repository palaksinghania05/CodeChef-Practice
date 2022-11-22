/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-11-2022
 */

package beginner;

import java.util.Scanner;

public class Relativity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int g = sc.nextInt();
            int c = sc.nextInt();
            System.out.println((int) (Math.pow(c, 2)) / (2 * g));
            T--;
        }
    }
}
