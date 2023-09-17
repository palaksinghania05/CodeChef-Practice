/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 19-08-2022
 */

package beginner1;

import java.util.Scanner;

public class EncodingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            char[] arr = S.toCharArray();
            if (N % 2 == 1) {
                for (int i = 0; i < N - 1; i = i + 2) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                for (int i = 0; i < N; i = i + 2) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            int[] x = new int[26];
            int[] y = new int[26];
            int[][] z = new int[26][2];
            for (int j = 0; j < 26; j++) {
                x[j] = j + 97;
            }
            for (int j = 0; j < 26; j++) {
                y[j] = x[25 - j];
            }
            for (int j = 0; j < 26; j++) {
                z[j][0] = x[j];
                z[j][1] = y[j];
            }
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < N; i++) {
                int p = arr[i];
                for (int k = 0; k < 26; k++) {
                    if (p == z[k][0]) {
                        arr[i] = (char) z[k][1];
                        result.append(arr[i]);
                    }
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
