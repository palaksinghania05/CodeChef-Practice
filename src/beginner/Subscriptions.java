/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-09-2022
 */

package beginner;

import java.util.Scanner;

public class Subscriptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            if(N<6)
                System.out.println(X);
            else{
                if(N%6==0)
                    System.out.println((N/6)*X);
                else
                    System.out.println(((N/6)+1)*X);
            }
            T--;
        }
    }
}
