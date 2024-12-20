package advanced1;

import java.util.Scanner;

public class BowlingStrategy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int L = sc.nextInt();
            int count = 0;
            if (N > K * L || (K == 1 && N > 1)) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < L; i++) {
                    for (int j = 0; j < K; j++) {
                        if (count < N) {
                            System.out.print(j + 1);
                            System.out.print(" ");
                            count++;
                        } else
                            break;
                    }
                    if (count < N) {
                        continue;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(" ");
            T--;
        }
    }
}
