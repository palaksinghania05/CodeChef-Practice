package advanced1;

import java.util.Scanner;

public class ChefInFantasyLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int S = sc.nextInt();
            int[] P = new int[N];
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int minA = 101, minB = 101;
            for (int i = 0; i < N; i++) {
                if (arr[i] == 0) {
                    if (P[i] < minA)
                        minA = P[i];
                } else if (arr[i] == 1) {
                    if (P[i] < minB)
                        minB = P[i];
                }
            }
            if (S + minB + minA <= 100) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            T--;
        }
    }
}
