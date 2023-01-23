/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-01-2023
 */

package beginner1;

import java.util.Scanner;

public class BuyingNewTablet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int B = sc.nextInt();
            int result = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                int W = sc.nextInt();
                int H = sc.nextInt();
                int P = sc.nextInt();
                if (P > B)
                    continue;
                else {
                    if (result < W * H)
                        result = W * H;
                }
            }
            if (result == Integer.MIN_VALUE)
                System.out.println("no tablet");
            else
                System.out.println(result);
            T--;
        }
    }
}
