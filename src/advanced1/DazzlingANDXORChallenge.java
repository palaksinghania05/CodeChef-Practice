package advanced1;

import java.util.Scanner;

public class DazzlingANDXORChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            if (N % 4 == 0) {
                System.out.println(N + 3);
            } else if (N % 4 == 1) {
                System.out.println(N);
            } else {
                System.out.println(3);
            }
        }
    }
}
