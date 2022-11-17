/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-11-2022
 */

package beginner;

import java.util.Scanner;

public class HigherDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 10; i >= 0 ; i--) {
            if(N%i == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
