package beginner1;

import java.util.Scanner;

public class ABooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arrA = new int[N];
            for (int i = 0; i < N; i++) {
                arrA[i] = sc.nextInt();
            }
            int[] arrB = new int[N];
            for (int i = 0; i < N; i++) {
                int count = 0;
                for (int j = 0; j < N; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (arrA[j] > arrA[i]) {
                        count++;
                    }
                }
                arrB[i] = count;
            }
            for (int j = 0; j < N; j++) {
                System.out.print(arrB[j] + " ");
            }
            System.out.println();
            T--;
        }
    }
}
