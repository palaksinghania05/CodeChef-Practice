/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 30-09-2022
 */

package beginner;

import java.util.Scanner;

public class MarioAndBullet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int time = (Y/X);
            if(time>Z)
                System.out.println(0);
            else
                System.out.println(Z-time);
            T--;
        }
    }
}
