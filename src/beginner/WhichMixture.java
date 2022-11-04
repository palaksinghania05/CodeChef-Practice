/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 04-11-2022
 */

package beginner;

import java.util.Scanner;

public class WhichMixture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A>0 && B>0)
                System.out.println("Solution");
            else if(A==0)
                System.out.println("Liquid");
            else
                System.out.println("Solid");
            T--;
        }
    }
}
