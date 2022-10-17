/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-10-2022
 */

package beginner;

import java.util.Scanner;

public class ChefAndRaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            if((A!=X && B!=Y) && (A!=Y && B!=X))
                System.out.println(2);
            else if((A==X && B==Y) || (A==Y && B==X))
                System.out.println(0);
            else
                System.out.println(1);
            T--;
        }
    }
}
