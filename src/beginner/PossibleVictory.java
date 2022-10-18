/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-10-2022
 */

package beginner;

import java.util.Scanner;

public class PossibleVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int O = sc.nextInt();
        int C = sc.nextInt();
        int remainingOvers = 20-O;
        if((remainingOvers*6*6)+C>R)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
