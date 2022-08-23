/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 23-08-2022
 */

package beginner;

import java.util.Scanner;

public class MonthlyBudget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(30*Y <= X)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
