/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-09-2022
 */

package beginner;

import java.util.Scanner;

public class ChefAndGym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if(X+Y<=Z)
                System.out.println(2);
            else if(X<=Z)
                System.out.println(1);
            else
                System.out.println(0);
            T--;
        }
    }
}
