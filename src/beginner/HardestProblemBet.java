/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 25-10-2022
 */

package beginner;

import java.util.Scanner;

public class HardestProblemBet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int min = Math.min(A, Math.min(B,C));
            if(min==A)
                System.out.println("Draw");
            else if(min==B)
                System.out.println("Bob");
            else
                System.out.println("Alice");
            T--;
        }
    }
}
