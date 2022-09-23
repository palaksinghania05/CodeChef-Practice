/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 23-09-2022
 */

package beginner;

import java.util.Scanner;

public class JengaNight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int x = sc.nextInt();
            if(x%N==0)
                System.out.println("Yes");
            else if(N>x)
                System.out.println("No");
            else
                System.out.println("No");
            T--;
        }
    }
}
