/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 19-12-2022
 */

package beginner;

import java.util.Scanner;

public class BackToCampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            if (N % K == 0)
                System.out.println(N / K);
            else
                System.out.println(N / K + 1);
            T--;
        }
    }
}
