package advanced1;

import java.util.Scanner;

public class ChefAndSubsetAdditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            boolean flag = true;
            for (int i = 0; i < N; i++) {
                if (A[i] + X == B[i] || A[i] + Y == B[i]) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
