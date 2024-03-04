package advanced1;

import java.util.Scanner;

public class JumpingInTheHills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int U = sc.nextInt();
            int D = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            boolean flag = true;
            int result = 1;
            for (int i = 1; i < N; i++) {
                if (arr[i] == arr[i - 1]) {
                    result++;
                } else if (arr[i] > arr[i - 1]) {
                    if (arr[i] - arr[i - 1] <= U) {
                        result++;
                    } else {
                        break;
                    }
                } else if (arr[i] < arr[i - 1]) {
                    if (arr[i - 1] - arr[i] <= D) {
                        result++;
                    } else if (flag) {
                        result++;
                        flag = false;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
