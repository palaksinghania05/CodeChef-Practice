package beginner2;

import java.util.Scanner;

public class ChefAndGift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++)
                a[i] = sc.nextInt();
            int count = 0;
            for (int i = 0; i < N; i++) {
                if ((a[i] & 1) == 0)
                    count++;
            }
            if (K == 0 && count == N) {
                System.out.println("NO");
            } else if (count >= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
