/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 01-09-2022
 */

package beginner;

import java.util.Scanner;

public class CreditScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if(X>=750)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
