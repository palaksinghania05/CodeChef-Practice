/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 10-01-2023
 */

package beginner;

import java.util.Scanner;

public class KitchenTimetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    if (A[i] >= B[i])
                        count++;
                } else {
                    if (A[i] - A[i - 1] >= B[i])
                        count++;
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
