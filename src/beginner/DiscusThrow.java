/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 25-09-2022
 */

package beginner;

import java.util.Scanner;

public class DiscusThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            System.out.println(Math.max(A, Math.max(B,C)));
            T--;
        }
    }
}
