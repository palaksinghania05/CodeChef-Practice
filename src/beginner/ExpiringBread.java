/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 21-08-2022
 */

package beginner;

import java.util.Scanner;

public class ExpiringBread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            if(M*K >= N)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
