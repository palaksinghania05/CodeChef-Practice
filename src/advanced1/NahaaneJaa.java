package advanced1;

import java.util.Scanner;

public class NahaaneJaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                if (i != N - 1 && arr[i] == K) {
                    flag = true;
                    break;
                }
            }
            if (flag || (N == 1 && arr[0] == K)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            T--;
        }
    }
}
