/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-08-2022
 */

package beginner;

import java.util.Scanner;

public class FillTheBucket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int K = sc.nextInt();
            int X = sc.nextInt();
            System.out.println(K-X);
            T--;
        }
    }
}
