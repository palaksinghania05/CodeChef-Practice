/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 13-01-2023
 */

package beginner;

import java.util.Scanner;

public class ChessMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int time = 2 * (180 + N);
            System.out.println(time - (A + B));
            T--;
        }
    }
}
