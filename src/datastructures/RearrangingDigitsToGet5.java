/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-06-2022
 */

package datastructures;

import java.util.Scanner;

public class RearrangingDigitsToGet5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int D = sc.nextInt();
            String N = sc.next();
            boolean flag = false;
            for (int i = 0; i < D; i++) {
                if(N.charAt(i)=='0' || N.charAt(i)=='5') {
                    flag = true;
                    break;
                }
            }
            if(flag)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
