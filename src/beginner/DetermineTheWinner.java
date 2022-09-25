/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 25-09-2022
 */

package beginner;

import java.util.Scanner;

public class DetermineTheWinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int Pa = sc.nextInt();
            int Pb = sc.nextInt();
            int Qa = sc.nextInt();
            int Qb = sc.nextInt();
            if(Math.max(Pa,Pb)>Math.max(Qa,Qb))
                System.out.println("Q");
            else if(Math.max(Pa,Pb)<Math.max(Qa,Qb))
                System.out.println("P");
            else
                System.out.println("Tie");
            T--;
        }
    }
}
