package advanced1;

import java.util.Scanner;

public class MissingSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 1; i <= N; i++)
                arr[i - 1] = (2 * i) - 1;
            for (int j = 0; j < N; j++)
                System.out.print(arr[j] + " ");
            System.out.println();
            T--;
        }
    }
}
