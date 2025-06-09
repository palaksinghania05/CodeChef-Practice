package advanced1;

import java.util.Scanner;

public class LittleElephantAndBombs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            boolean[] arr = new boolean[N];
            for (int i = 0; i <= N - 1; i++) {
                if (i == 0 && S.charAt(i) == '1') {
                    arr[i] = true;
                    if (i + 1 <= N - 1) {
                        arr[i + 1] = true;
                    }
                } else if (i == N - 1 && S.charAt(i) == '1') {
                    arr[i] = true;
                    if (i - 1 >= 0) {
                        arr[i - 1] = true;
                    }
                } else if (i > 0 && i < N - 1 && S.charAt(i) == '1') {
                    arr[i] = true;
                    arr[i - 1] = true;
                    arr[i + 1] = true;
                }
            }
            int result = 0;
            for (int i = 0; i < N; i++) {
                if (!arr[i]) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
