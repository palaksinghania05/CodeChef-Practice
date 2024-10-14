package advanced1;

import java.util.Scanner;

public class CricketScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Ri = new int[N];
        int[] Wi = new int[N];
        for (int i = 0; i < N; i++) {
            Ri[i] = sc.nextInt();
            Wi[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (i > 0) {
                if (Ri[i] < Ri[i - 1]) {
                    count++;
                }
                if (Wi[i] < Wi[i - 1]) {
                    count++;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (i < N - 1) {
                if (Wi[i] == 10) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
