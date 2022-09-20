/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 20-09-2022
 */

package beginner;

import java.util.Scanner;

public class SastaSharkTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int valA = (X*100)/10;
            int valB = (Y*100)/20;
            if(valA>valB)
                System.out.println("FIRST");
            else if(valB>valA)
                System.out.println("SECOND");
            else
                System.out.println("ANY");
            T--;
        }
    }
}
