/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 21-10-2022
 */

package beginner;

import java.util.Scanner;

public class MutatedMinions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int c = 0;
            for (int i = 0; i < N; i++) {
                if((arr[i]+K)%7==0)
                    c++;
            }
            System.out.println(c);
            T--;
        }
    }
}
