/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-07-2022
 */

package beginner;

import java.util.Scanner;

public class ChairsRequirement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(Y>=X)
                System.out.println(0);
            else
                System.out.println(X-Y);
            T--;
        }
    }
}
