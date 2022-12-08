/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 06-12-2022
 */

package beginner;

import java.util.Scanner;

public class HowManyDigitsDoIHave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int digits = 0;

        while (N != 0) {
            N = N / 10;
            digits++;
        }

        if (digits <= 3) {
            System.out.println(digits);
        } else {
            System.out.println("More than 3 digits");
        }
    }
}
