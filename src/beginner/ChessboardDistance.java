/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 06-10-2022
 */

package beginner;

import java.util.Scanner;

public class ChessboardDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();
            System.out.println(Math.max(Math.abs(X1-X2), Math.abs(Y1-Y2)));
            T--;
        }
    }
}
