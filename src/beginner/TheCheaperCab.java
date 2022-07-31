/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 31-07-2022
 */

package beginner;

import java.util.Scanner;

public class TheCheaperCab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X<Y)
                System.out.println("FIRST");
            else if(X>Y)
                System.out.println("SECOND");
            else
                System.out.println("ANY");
            T--;
        }
    }
}
