/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-12-2022
 */

package beginner;

import java.util.Scanner;

public class ChefAndPriceControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int arr[] = new int[N];
            int c1 = 0;
            int c2 = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                c1 = c1 + arr[i];
                if (arr[i] > K)
                    arr[i] = K;
                c2 += arr[i];
            }
            System.out.println(c1 - c2);
            T--;
        }
    }
}
