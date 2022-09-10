/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 10-09-2022
 */

package beginner;

import java.util.Scanner;

public class ChefChoco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int C = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println((C-X)*Y);
            T--;
        }
    }
}
