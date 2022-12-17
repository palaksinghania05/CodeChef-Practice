/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-12-2022
 */

package beginner;

import java.util.Scanner;

public class NoTimeToWait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int[] times = new int[N];
        for (int i = 0; i < N; i++) {
            times[i] = sc.nextInt();
        }
        int f = 0;
        for (int i = 0; i < N; i++) {
            if (times[i] + x >= H) {
                f = 1;
                break;
            }
        }
        if (f == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
