package beginner1;

import java.util.Scanner;

public class DivisibleByI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            int count = 1;
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    arr[i] = count;
                } else {
                    arr[i] = N - count + 1;
                    count++;
                }
            }
            for (int i = N - 1; i >= 0; i--)
                System.out.print(arr[i] + " ");
            System.out.println();
            T--;
        }
    }
}
