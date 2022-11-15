/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-11-2022
 */

package beginner;

import java.util.Scanner;

public class DevendraAndWaterSports {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int Z = sc.nextInt();
            int Y = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if((Z-Y)>=(A+B+C))
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
