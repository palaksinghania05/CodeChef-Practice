/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-09-2022
 */

package beginner;

import java.util.Scanner;

public class WatchingMoviesAt2X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println((Y/2)+(X-Y));
    }
}
