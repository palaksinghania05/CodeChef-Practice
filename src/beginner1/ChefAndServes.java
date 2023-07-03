package beginner1;

import java.util.Scanner;

public class ChefAndServes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int P1 = sc.nextInt();
            int P2 = sc.nextInt();
            int K = sc.nextInt();
            int score = P1 + P2;
            int turn = (score % (K * 2));
            if (turn < K) {
                System.out.println("CHEF");
            } else {
                System.out.println("COOK");
            }
            T--;
        }
    }
}
