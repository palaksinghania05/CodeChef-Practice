package beginner1;

import java.util.Scanner;

public class TheAttackOfQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int sum = N - 1 + N - 1;
            sum += Math.min(Math.abs(X - 1), Math.abs(Y - 1));
            sum += Math.min(Math.abs(X - 1), Math.abs(Y - N));
            sum += Math.min(Math.abs(X - N), Math.abs(Y - 1));
            sum += Math.min(Math.abs(X - N), Math.abs(Y - N));
            System.out.println(sum);
            T--;
        }
    }
}
