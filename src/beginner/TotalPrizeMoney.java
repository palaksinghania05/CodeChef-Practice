/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 14-07-2022
 */

package beginner;

import java.util.Scanner;

public class TotalPrizeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(10*X + 90*Y);
            T--;
        }
    }
}
