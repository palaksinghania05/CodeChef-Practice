/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-07-2022
 */

package beginner;

import java.util.Scanner;

public class AgeLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int A = sc.nextInt();
            if(A>=X && A<Y)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
