/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 05-11-2022
 */

package beginner;

import java.util.Scanner;

public class ChessFormat {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a+b<3)
                System.out.println(1);
            else if(a+b>=3 && a+b <= 10)
                System.out.println(2);
            else if(a+b>=11 && a+b <= 60)
                System.out.println(3);
            else
                System.out.println(4);
            T--;
        }
    }
}
