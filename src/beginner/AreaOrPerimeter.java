/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-11-2022
 */

package beginner;

import java.util.Scanner;

public class AreaOrPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int B = sc.nextInt();
        int area = L*B;
        int perimeter = 2 * (L+B);
        if(area>perimeter)
            System.out.println("Area " + area);
        else if(perimeter>area)
            System.out.println("Peri " + perimeter);
        else
            System.out.println("Eq " + area);
    }
}
