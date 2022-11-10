/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 10-11-2022
 */

package beginner;

import java.util.Scanner;

public class ColdPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int M = sc.nextInt();
            int S = sc.nextInt();
            System.out.println(M/S);
            T--;
        }
    }
}
