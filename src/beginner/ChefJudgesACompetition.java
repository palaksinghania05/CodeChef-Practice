/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-01-2023
 */

package beginner;

import java.util.Scanner;

public class ChefJudgesACompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int maxA = 0;
            int index1 = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if (A[i] > maxA) {
                    maxA = A[i];
                    index1 = i;
                }
            }
            int[] B = new int[N];
            int maxB = 0;
            int index2 = 0;
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
                if (B[i] > maxB) {
                    maxB = B[i];
                    index2 = i;
                }
            }
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < N; i++) {
                if (i != index1)
                    sum1 += A[i];
                if (i != index2)
                    sum2 += B[i];
            }
            if (sum1 < sum2)
                System.out.println("Alice");
            else if (sum1 == sum2)
                System.out.println("Draw");
            else
                System.out.println("Bob");
            T--;
        }
    }
}
