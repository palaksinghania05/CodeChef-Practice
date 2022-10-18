/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-10-2022
 */

package beginner;

import java.util.Scanner;

public class PresentsForChefina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int cost = 0;
            int R = N / 5;
            cost = R * 4;
            cost += N%5;
            System.out.println(cost);
            T--;
        }
    }
}
