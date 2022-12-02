/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 29-11-2022
 */

package beginner;

import java.util.Scanner;

public class SecretRecipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X1 = sc.nextInt();
            int X2 = sc.nextInt();
            int X3 = sc.nextInt();
            int V1 = sc.nextInt();
            int V2 = sc.nextInt();
            float chef = (float) (X3 - X1) / V1;
            float kefa = (float) (X2 - X3) / V2;
            if (chef > kefa)
                System.out.println("Kefa");
            else if (chef < kefa)
                System.out.println("Chef");
            else
                System.out.println("Draw");
            T--;
        }
    }
}
