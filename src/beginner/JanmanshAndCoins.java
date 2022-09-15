/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-09-2022
 */

package beginner;

import java.util.Scanner;

public class JanmanshAndCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(X*10+Y*5);
            T--;
        }
    }
}
