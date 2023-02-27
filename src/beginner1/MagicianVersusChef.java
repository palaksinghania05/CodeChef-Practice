package beginner1;

import java.util.Scanner;

public class MagicianVersusChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int S = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                if (i + 1 == X)
                    arr[i] = 1;
                else
                    arr[i] = 0;
            }
            for (int i = 0; i < S; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                swap(arr, a, b);
            }
            int i = 0;
            for (; i < N; i++) {
                if (arr[i] == 1)
                    break;
            }
            System.out.println(i + 1);
            T--;
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a - 1];
        arr[a - 1] = arr[b - 1];
        arr[b - 1] = temp;
    }
}
