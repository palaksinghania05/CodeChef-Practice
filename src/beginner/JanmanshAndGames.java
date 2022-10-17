/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-10-2022
 */

package beginner;

import java.util.Scanner;

public class JanmanshAndGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            for (int i=1;i<=Y;i++) {
                X++;
            }
            if(X%2==0)
            {
                System.out.println("Janmansh");
            } else {
                System.out.println("Jay");
            }
            T--;
        }
    }
}
