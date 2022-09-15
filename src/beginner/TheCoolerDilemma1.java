/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-09-2022
 */

package beginner;

import java.util.Scanner;

public class TheCoolerDilemma1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int M = sc.nextInt();
            if(X*M<Y)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
