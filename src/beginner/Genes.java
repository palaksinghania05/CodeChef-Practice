/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 29-10-2022
 */

package beginner;

import java.util.Scanner;

public class Genes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        char c1 = S1.charAt(0);
        char c2 = S2.charAt(0);
        if(c1=='R' || c2=='R'){
            System.out.println("R");
        }
        else if(c1=='B' || c2=='B'){
            System.out.println("B");
        }
        else{
            System.out.println("G");
        }
    }
}
