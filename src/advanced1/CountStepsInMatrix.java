package advanced1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CountStepsInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[][] arr = new int[N * N][3];
            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int num = sc.nextInt();
                    arr[count][0] = num;
                    arr[count][1] = i; // row index
                    arr[count][2] = j; // column index
                    count++;
                }
            }
            Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
            int result = 0;
            for (int i = 0; i < count - 1; i++) {
                int r = Math.abs(arr[i + 1][1] - arr[i][1]);
                int c = Math.abs(arr[i + 1][2] - arr[i][2]);
                result += r + c;
            }
            System.out.println(result);
            T--;
        }
    }
}
