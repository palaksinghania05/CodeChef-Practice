/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 14-10-2022
 */

package beginner;

import java.util.Scanner;

public class CyclicQuadrilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            if(A+C==180 && B+D==180)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
