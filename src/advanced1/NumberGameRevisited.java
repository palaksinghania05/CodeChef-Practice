package advanced1;

import java.util.Scanner;

public class NumberGameRevisited {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextLong();
            if (N % 4 != 1)
                System.out.println("BOB");
            else
                System.out.println("ALICE");
            T--;
        }
    }
}
