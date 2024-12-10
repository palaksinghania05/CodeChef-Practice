package advanced1;

import java.util.Scanner;

public class NotDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            T--;
        }
    }
}
