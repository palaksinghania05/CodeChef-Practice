/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 20-09-2022
 */

package beginner;

import java.util.Scanner;

public class ChefAndBirdFarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if(Z%X == 0 && Z%Y == 0)
                System.out.println("ANY");
            else if(Z%X == 0)
                System.out.println("CHICKEN");
            else if(Z%Y == 0)
                System.out.println("DUCK");
            else
                System.out.println("NONE");
            T--;
        }
    }
}
