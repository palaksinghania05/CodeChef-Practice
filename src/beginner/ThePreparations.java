/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 29-10-2022
 */

package beginner;

import java.util.Scanner;

public class ThePreparations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int M = sc.nextInt();
            int N = sc.nextInt();
            int K = sc.nextInt();
            if(M>N*K)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
