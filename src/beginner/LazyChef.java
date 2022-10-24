/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-10-2022
 */

package beginner;

import java.util.Scanner;

public class LazyChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int x = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            if((m*x)<(d+x))
                System.out.println(m*x);
            else
                System.out.println(d+x);
            T--;
        }
    }
}
