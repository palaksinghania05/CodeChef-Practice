/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-06-2022
 */

package datastructures.level2;

import java.util.Scanner;

public class ProgrammingLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int A1 = sc.nextInt();
            int B1 = sc.nextInt();
            int A2 = sc.nextInt();
            int B2 = sc.nextInt();
            if((A == A1 && B == B1) || (A == B1 && B == A1))
                System.out.println(1);
            else if((A == A2 && B == B2) || (A == B2 && B == A2))
                System.out.println(2);
            else
                System.out.println(0);
            T--;
        }
    }
}
