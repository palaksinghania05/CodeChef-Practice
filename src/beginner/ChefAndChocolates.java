/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 05-08-2022
 */

package beginner;

import java.util.Scanner;

public class ChefAndChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int money = X*5+Y*10;
            System.out.println(money/Z);
            T--;
        }
    }
}
