/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-09-2022
 */

package beginner;

import java.util.Scanner;

public class BatteryLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            if(X<=15)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
