package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] arr = new int[N * M];
            int evenCount = 0, oddCount = 0;
            for (int i = 0; i < N * M; i++) {
                arr[i] = sc.nextInt();
            }
            int temp = 0;
            Arrays.sort(arr);
            for (int i = N * M - 1; i >= 0; i--) {
                if (temp % 2 == 0)
                    evenCount += arr[i];
                else
                    oddCount += arr[i];
                temp++;
            }
            if (evenCount > oddCount)
                System.out.println("Cyborg");
            else if (oddCount > evenCount)
                System.out.println("Genie");
            else
                System.out.println("Draw");
            T--;
        }
    }
}
