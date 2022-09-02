/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 02-09-2022
 */

package beginner;

import java.util.Scanner;

public class IncreaseIQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if(X+7>170)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
