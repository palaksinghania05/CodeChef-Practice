/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 07-11-2022
 */

package beginner;

import java.util.Scanner;

public class ValidPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A == B || B == C || C == A)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
