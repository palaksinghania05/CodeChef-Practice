/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 13-10-2022
 */

package beginner;

import java.util.Scanner;

public class InportantPagesOnCodechef {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A==0){
            System.out.println("https://www.codechef.com/practice");
        } else{
            if(B==0)
                System.out.println("https://www.codechef.com/contests");
            else
                System.out.println("https://discuss.codechef.com");
        }
    }
}
