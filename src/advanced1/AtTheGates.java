package advanced1;

import java.util.Scanner;

public class AtTheGates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            char[] arr = new char[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.next().charAt(0);
            }
            int count = 0;
            int idx = N - 1;
            int tempK = K;
            while (tempK > 0) {
                if (arr[idx] == 'H') {
                    if (count % 2 == 0)
                        count++;
                } else if (arr[idx] == 'T' && count % 2 != 0) {
                    count++;
                }
                idx--;
                tempK--;
            }
            int result = 0;
            for (int i = 0; i < N - K; i++) {
                if (arr[i] == 'H' && count % 2 == 0) {
                    result++;
                } else if (arr[i] == 'T' && count % 2 != 0) {
                    result++;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
