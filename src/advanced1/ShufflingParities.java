package advanced1;

import java.util.Scanner;

public class ShufflingParities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int even = 0, odd = 0, result = 0;
            for (int i = 0; i < N; i += 2) {
                if (arr[i] % 2 == 0)
                    result++;
                else
                    odd++;
            }
            for (int i = 1; i < N; i += 2) {
                if (arr[i] % 2 == 1)
                    result++;
                else
                    even++;
            }
            result += 2 * Math.min(even, odd);
            System.out.println(result);
            T--;
        }
    }
}
