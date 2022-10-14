/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 14-10-2022
 */

package beginner;

import java.util.Scanner;

public class AOrB {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int order1 = (500-X*2)+(1000-(X+Y)*4);
            int order2 = (1000-Y*4)+(500-(X+Y)*2);
            System.out.println(Math.max(order1,order2));
            T--;
        }
    }
}
