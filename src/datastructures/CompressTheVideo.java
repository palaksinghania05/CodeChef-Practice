/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-06-2022
 */

package datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class CompressTheVideo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextLong();
            }
            int count = N;
            for (int i = 0; i < N-1; i++) {
                if (arr[i] == arr[i + 1])
                    count--;
            }
            System.out.println(count);
            T--;
        }
    }
}

