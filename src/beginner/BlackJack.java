/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 04-10-2022
 */

package beginner;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(21-(A+B)>10)
                System.out.println(-1);
            else
                System.out.println(21-(A+B));
            T--;
        }
    }
}
