package advanced1;

import java.util.Scanner;

public class FakeGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            for (int i = 1; i <= N; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            T--;
        }
    }
}
