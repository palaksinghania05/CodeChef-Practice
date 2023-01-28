/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-01-2023
 */

package beginner1;

import java.util.Scanner;

public class BreakTheStick {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a!=0)
        {
            int n=sc.nextInt();
            int h=sc.nextInt();
            if(n%2==0)
                System.out.println("yes");
            else
            if(h%2==0)
                System.out.println("no");
            else
                System.out.println("yes");
            a--;
        }
    }
}
