/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 05-09-2022
 */

package beginner;

import java.util.Scanner;

public class BucketAndWaterFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int W = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if(X<W+Y*Z)
                System.out.println("Overflow");
            else if(X>W+Y*Z)
                System.out.println("Unfilled");
            else
                System.out.println("Filled");
            T--;
        }
    }
}
