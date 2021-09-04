package beginner;

import java.util.Scanner;

public class TheBlockGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 1; i <= t; i++) {
                int N = sc.nextInt();
                int M = N;
                int rem = 0;
                int reverseN = 0;
                while (M != 0) {
                    rem = M % 10;
                    reverseN = reverseN * 10 + rem;
                    M = M / 10;
                }
                if (reverseN == N)
                    System.out.println("wins");
                else
                    System.out.println("loses");
            }
        }
    }
}
