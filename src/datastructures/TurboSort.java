/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-06-2022
 */

package datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class TurboSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] arr = new long[T];
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        for (long element : arr) {
            System.out.println(element);
        }
    }
}
