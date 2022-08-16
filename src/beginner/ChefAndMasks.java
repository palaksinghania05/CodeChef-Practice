/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-08-2022
 */

package beginner;

import java.util.Scanner;

public class ChefAndMasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            String result = (X*100<Y*10) ? "DISPOSABLE" : "CLOTH";
            System.out.println(result);
            T--;
        }
    }
}
