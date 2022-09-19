/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 19-09-2022
 */

package beginner;

import java.util.Scanner;

public class TheThreeTopics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        if(X!=A && X!=B && X!=C)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
