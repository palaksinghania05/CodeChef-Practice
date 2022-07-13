/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 13-07-2022
 */

package beginner;

import java.util.Scanner;

public class HowManyUnattemptedProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if(Y<=X)
            System.out.println(X-Y);

    }
}
