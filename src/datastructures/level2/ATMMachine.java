/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-06-2022
 */

package datastructures.level2;

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N =sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]<=K){
                    System.out.print(1);
                    K = K-arr[i];
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
            T--;
        }
    }
}
