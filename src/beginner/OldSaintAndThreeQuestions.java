/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-12-2022
 */

package beginner;

import java.util.Scanner;

public class OldSaintAndThreeQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int[] A = new int[3];
            int[] B = new int[3];
            int onesA = 0;
            int onesB = 0;
            for (int i = 0; i < 3; i++) {
                A[i] = sc.nextInt();
                if (A[i] == 1)
                    onesA++;
            }
            for (int i = 0; i < 3; i++) {
                B[i] = sc.nextInt();
                if (B[i] == 1)
                    onesB++;
            }
            //   System.out.println(onesA + " " + onesB);
            if (onesA == onesB)
                System.out.println("Pass");
            else
                System.out.println("Fail");
            T--;
        }
    }
}
