/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 12-07-2022
 */

package beginner;

import java.util.Scanner;

public class Fitness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            System.out.println(2*X*5);
            T--;
        }
    }
}
