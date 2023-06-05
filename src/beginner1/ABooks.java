package beginner1;

import java.util.Scanner;

public class ABooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int[] arr1 = new int[N];
            for (int i = 0; i < N; i++) {
                int count = 0;
                for (int j = 0; j < N; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (arr[j] > arr[i]) {
                        count++;
                    }
                }
                arr1[i] = count;
            }
            for (int j = 0; j < N; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
            T--;
        }
    }
}
