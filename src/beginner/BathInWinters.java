/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 27-09-2022
 */

package beginner;

import java.util.Scanner;

public class BathInWinters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X<2*Y)
                System.out.println(0);
            else{
                int need = Y*2;
                System.out.println(X/need);
            }
            T--;
        }
    }
}
