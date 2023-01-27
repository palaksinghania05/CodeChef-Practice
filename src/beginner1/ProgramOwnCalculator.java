/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 27-01-2023
 */

package beginner1;

import java.util.Scanner;

public class ProgramOwnCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String C = sc.next();
        if (C.equals("+"))
            System.out.println(A + B);
        else if (C.equals("-"))
            System.out.println(A - B);
        else if (C.equals("*"))
            System.out.println(A * B);
        else
            System.out.println((double) A / B);
    }
}
