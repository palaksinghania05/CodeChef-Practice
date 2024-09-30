package advanced1;

import java.util.Scanner;

public class ChefAndGround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                sum += A[i];
            }
            if ((sum + M) % N == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            T--;
        }
    }
}
