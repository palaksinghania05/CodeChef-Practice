package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class EatTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[N][2];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 2; j++) arr[i][j] = sc.nextInt();
            }
            Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));
            long result = arr[0][1];
            int temp = 0;
            while (temp < N - 1 && arr[temp][0] == arr[temp + 1][0]) temp++;
            result += arr[temp + 1][1];
            System.out.println(result);
            T--;
        }
    }
}
