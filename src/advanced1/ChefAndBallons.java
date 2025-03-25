package advanced1;

import java.util.Scanner;

public class ChefAndBallons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long R = sc.nextLong();
            long G = sc.nextLong();
            long B = sc.nextLong();
            long K = sc.nextLong();
            if (R >= K)
                R = K - 1;
            if (G >= K)
                G = K - 1;
            if (B >= K)
                B = K - 1;
            System.out.println((long) (R + G + B + 1));
        }
    }
}
