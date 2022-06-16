/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-06-2022
 */

package beginner;

import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorial {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                BigInteger factorial = new BigInteger("1");
                while (n > 0) {
                    factorial = factorial.multiply(BigInteger.valueOf(n));
                    n--;
                }
                System.out.println(factorial);
            }
        }
    }
}
