package advanced1;

import java.util.Scanner;

public class SarthakAndHisMagicGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    System.out.print(1 + " ");
                }
                System.out.println();
            }
        }
    }
}
