package advanced1;

import java.util.Scanner;

public class HardSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int[] temp = new int[N];
            for (int i = 1; i < N; i++) {
                temp[i] = -1;
            }
            temp[0] = 0;
            for (int i = 0; i < N - 1; i++) {
                int oldIndex = temp[arr[i]];
                if (oldIndex == -1) arr[i + 1] = 0;
                else arr[i + 1] = i - oldIndex;
                temp[arr[i]] = i;
            }
            int result = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] == arr[N - 1])
                    result++;
            }
            System.out.println(result);
            T--;
        }
    }
}
