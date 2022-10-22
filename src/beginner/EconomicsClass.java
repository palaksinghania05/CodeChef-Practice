/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-10-2022
 */

package beginner;

import java.util.Scanner;

public class EconomicsClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int[] S = new int[N];
            int[] D = new int[N];
            for (int i = 0; i < N; i++) {
                S[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                D[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                if(S[i] == D[i])
                    count++;
            }
            System.out.println(count);
            T--;
        }
    }
}
