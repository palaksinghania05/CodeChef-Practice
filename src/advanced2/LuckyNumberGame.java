package advanced2;

import java.util.Scanner;

public class LuckyNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int bob = 0;
            int alice = 0;
            int aliceBob = 0;
            for (int j = 0; j < N; j++) {
                int temp = sc.nextInt();
                if (temp % A == 0 && temp % B == 0)
                    aliceBob++;
                else if (temp % A == 0)
                    bob++;
                else if (temp % B == 0)
                    alice++;
            }
            if (aliceBob != 0)
                bob++;
            if (bob > alice)
                System.out.println("BOB");
            else
                System.out.println("ALICE");
        }
    }
}
