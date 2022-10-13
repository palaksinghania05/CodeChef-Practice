/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 13-10-2022
 */

package beginner;

import java.util.Scanner;

public class SelfDefenceTraining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }int count = 0;
            for (int i = 0; i < N; i++) {
                if(arr[i]>=10 && arr[i]<=60)
                    count++;
            }
            System.out.println(count);
            T--;
        }
    }
}
