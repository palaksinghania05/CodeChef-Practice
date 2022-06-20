/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-06-2022
 */

package datastructures.level1;

import java.util.Scanner;

public class RedLightGreenLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            long K = sc.nextLong();
            int result = 0;
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]>K)
                    result++;
            }
            System.out.println(result);
            T--;
        }
    }
}
