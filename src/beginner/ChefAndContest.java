/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-11-2022
 */

package beginner;

import java.util.Scanner;

public class ChefAndContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int chef = X + P * 10;
            int chefina = Y + Q * 10;
            if (chef < chefina)
                System.out.println("Chef");
            else if (chefina < chef)
                System.out.println("Chefina");
            else
                System.out.println("Draw");
            T--;
        }
    }
}
