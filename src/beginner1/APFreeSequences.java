package beginner1;

import java.util.Scanner;

public class APFreeSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            if (N < 3) {
                System.out.println("Yes");
                return;
            }
            int i;
            for (i = 0; i < N - 2; i++) {
                for (int j = i + 1; j < N - 1; j++) {
                    for (int k = j + 1; k < N; k++) {
                        if ((arr[j] - arr[i]) == (arr[k] - arr[j])) {
                            System.out.println("No");
                            i = N;
                            break;
                        }
                    }
                    if (i == N) {
                        break;
                    }
                }
                if (i == N) {
                    break;
                }
            }
            if (i == N - 2) {
                System.out.println("Yes");
            }
            T--;
        }
    }
}
