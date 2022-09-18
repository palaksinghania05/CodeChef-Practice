/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-09-2022
 */

package beginner;

import java.util.Scanner;

public class IsTheScoreConsistent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            if(C<A || D<B)
                System.out.println("IMPOSSIBLE");
            else
                System.out.println("POSSIBLE");
            T--;
        }
    }
}
