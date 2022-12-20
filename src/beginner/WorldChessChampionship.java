/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 19-12-2022
 */

package beginner;

import java.util.Scanner;

public class WorldChessChampionship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            String results = sc.next();
            int carslen = 0, chef = 0, draw = 0;
            for (int i = 0; i < results.length(); i++) {
                if (results.charAt(i) == 'C')
                    carslen += 2;
                else if (results.charAt(i) == 'N')
                    chef += 2;
                else {
                    carslen += 1;
                    chef += 1;
                }
            }
            if (carslen > chef) {
                System.out.println(60 * X);
            } else if (chef > carslen)
                System.out.println(40 * X);
            else
                System.out.println(55 * X);
            T--;
        }
    }
}
