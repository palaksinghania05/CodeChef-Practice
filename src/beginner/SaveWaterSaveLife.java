/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 08-12-2022
 */

package beginner;

import java.util.Scanner;

public class SaveWaterSaveLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int H = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int C = sc.nextInt();
            int litre = (int) (x + Math.floor(y / 2));
            if (C < H * litre)
                System.out.println("NO");
            else
                System.out.println("YES");
            T--;
        }
    }
}
