/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 04-10-2022
 */

package beginner;

import java.util.Scanner;

public class ScoreHigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            System.out.println(Math.max(A, Math.max(B, Math.max(C,D))));
            T--;
        }
    }
}
