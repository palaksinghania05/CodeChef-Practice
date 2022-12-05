/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-12-2022
 */

package beginner;

import java.util.Scanner;

public class PeacefulParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int Pa = sc.nextInt();
            int Pb = sc.nextInt();
            int Pc = sc.nextInt();
            if (Pa + Pc > Pb)
                System.out.println(Pa + Pc);
            else
                System.out.println(Pb);
            T--;
        }
    }
}
