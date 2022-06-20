package datastructures.level1;/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-06-2022
 */

import java.util.Scanner;

public class ProblemsInTODOList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            int count = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]>=1000)
                    count++;
            }
            System.out.println(count);
            T--;
        }
    }
}
