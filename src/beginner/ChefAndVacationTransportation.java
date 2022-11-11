/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 11-11-2022
 */

package beginner;

import java.util.Scanner;

public class ChefAndVacationTransportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();

        while (T-->0)
        {
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long Z = sc.nextLong();

            if((X+Y)>Z)
                System.out.println("TRAIN");
            else if ((X+Y)<Z) {
                System.out.println("PLANEBUS");
            } else if ((X+Y)==Z) {
                System.out.println("EQUAL");
            }
        }
    }
}
