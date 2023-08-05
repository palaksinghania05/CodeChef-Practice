package beginner1;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertToPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T > 0) {
            int S = sc.nextInt();
            long arr[] = new long[S];
            for (int i = 0; i < S; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long flag = 0, sum = 0;
            for (int i = 0; i < S; i++) {
                if (arr[i] > i + 1) {
                    flag = -1;
                } else {
                    sum += i + 1 - arr[i];
                }
            }
            if (flag == -1) {
                System.out.println(-1);
            } else {
                System.out.println(sum);
            }
            T--;
        }
    }
}
