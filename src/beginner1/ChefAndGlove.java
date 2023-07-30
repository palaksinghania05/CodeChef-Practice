package beginner1;

import java.util.Scanner;

public class ChefAndGlove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] L = new int[N];
            int[] G = new int[N];
            for (int i = 0; i < N; i++) {
                L[i] = sc.nextInt();
            }
            for (int j = 0; j < N; j++) {
                G[j] = sc.nextInt();
            }
            int count_front = 0;
            int count_back = 0;
            for (int k = 0; k < N; k++) {
                if (L[k] <= G[k]) {
                    count_front++;
                }
                if (L[N - 1 - k] <= G[k]) {
                    count_back++;
                }
            }
            if (count_front == N && count_back == N) {
                System.out.println("both");
            } else if (count_front == N) {
                System.out.println("front");
            } else if (count_back == N) {
                System.out.println("back");
            } else {
                System.out.println("none");
            }
            T--;
        }
    }
}
