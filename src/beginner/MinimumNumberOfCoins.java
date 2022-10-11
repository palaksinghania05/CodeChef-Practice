/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-10-2022
 */

package beginner;

import java.util.Scanner;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            if(X%10 == 0){
                System.out.println(X/10);
            }
            else{
                if((X%10)%5 == 0)
                    System.out.println(X/10 + (X%10)/5);
                else
                    System.out.println(-1);
            }
            T--;
        }
    }
}
