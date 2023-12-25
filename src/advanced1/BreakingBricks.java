package advanced1;

import java.util.Scanner;

public class BreakingBricks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int S = sc.nextInt();
            int W1 = sc.nextInt();
            int W2 = sc.nextInt();
            int W3 = sc.nextInt();
            if (W1 + W2 + W3 <= S)
                System.out.println(1);
            else if (W1 + W2 <= S || W3 + W2 <= S)
                System.out.println(2);
            else
                System.out.println(3);
            T--;
        }
    }
}
