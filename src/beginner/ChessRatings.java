/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 30-09-2022
 */

package beginner;

import java.util.Scanner;

public class ChessRatings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if((Y-X)%8==0)
                System.out.println((Y-X)/8);
            else
                System.out.println(((Y-X)/8)+1);
            T--;
        }
    }
}
