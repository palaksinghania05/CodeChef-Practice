/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-07-2022
 */

package beginner;

import java.util.Scanner;

public class LunchTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            if(X>=1 && X<=4)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
