/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 28-10-2022
 */

package beginner;

import java.util.Scanner;

public class ChefAndFruitStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(Math.min((X/2),Y));
            T--;
        }
    }
}
