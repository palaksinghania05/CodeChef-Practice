/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-08-2022
 */

package beginner1;

import java.util.Scanner;

public class HowMuchScholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        if(R>=1 && R<=50)
            System.out.println(100);
        else if(R>=51 && R<=100)
            System.out.println(50);
        else
            System.out.println(0);
    }
}
