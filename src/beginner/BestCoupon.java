/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-09-2022
 */

package beginner;

import java.util.Scanner;

public class BestCoupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int discount = (10*X)/100;
            if(discount>100)
                System.out.println(discount);
            else
                System.out.println(100);
            T--;
        }
    }
}
