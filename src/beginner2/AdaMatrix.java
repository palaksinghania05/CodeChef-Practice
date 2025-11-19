package beginner2;

import java.util.Scanner;

public class AdaMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int result = 0;
            int flag = 0;
            for (int i = N - 1; i > 0; i--) {
                for (int j = i - 1; j > i - 2; j--) {
                    int temp = i * N + j + 1;
                    if (arr[i][j] != temp && flag == 0) {
                        result++;
                        flag = 1;
                    } else if (arr[i][j] == temp && flag == 1) {
                        result++;
                        flag = 0;
                    }
                }
            }
            System.out.println(result);
        }
    }
}
