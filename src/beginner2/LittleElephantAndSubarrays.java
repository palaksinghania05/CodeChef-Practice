package beginner2;

import java.util.Scanner;

public class LittleElephantAndSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        while (Q-- > 0) {
            int K = sc.nextInt();
            int result = 0;
            for (int i = 0; i < N; i++) {
                int min = arr[i];
                for (int j = i; j < N; j++) {
                    min = Math.min(min, arr[j]);
                    if (min == K) {
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}
