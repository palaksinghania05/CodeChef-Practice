/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 05-09-2022
 */

package beginner;

import java.util.Scanner;

public class DominantArmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if(A>B+C || B>A+C || C>A+B)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
