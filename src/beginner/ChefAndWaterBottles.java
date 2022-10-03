/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 02-10-2022
 */

package beginner;

import java.util.Scanner;

public class ChefAndWaterBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int K = sc.nextInt();
            if(K<X)
                System.out.println(0);
            else{
                if(K/X >= N)
                    System.out.println(N);
                else
                    System.out.println(K/X);
            }
            T--;
        }
    }
}
