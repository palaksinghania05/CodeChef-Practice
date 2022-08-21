/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 21-08-2022
 */

package beginner;

import java.util.Scanner;

public class TyreProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(N*2+M*4);
            T--;
        }
    }
}
