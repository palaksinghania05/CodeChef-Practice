/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 29-01-2023
 */

package beginner1;

import java.util.Scanner;

public class CuttingRecipes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] items = new int[N];
            items[0] = sc.nextInt();
            int hcf = items[0];
            for (int i = 1; i < N; i++) {
                items[i] = sc.nextInt();
                hcf = findHCF(hcf, items[i]);
            }
            for (int i = 0; i < N; i++) {
                System.out.print(items[i] / hcf + " ");
            }
            T--;
        }
    }

    public static int findHCF(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
