/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 26-12-2022
 */

package beginner;

import java.util.Scanner;

public class CanYouEatIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int count = 0;
//            while(N>=K){
//                N = N-K;
//                count++;
//            }
//            if(N==0)
//                System.out.println(count);
//            else
//                System.out.println("-1");
            if (N % K == 0)
                System.out.println(N / K);
            else
                System.out.println(-1);
            T--;
        }
    }
}
