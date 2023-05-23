package beginner1;

import java.util.Scanner;

public class HungryChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int N = sc.nextInt();
            int R = sc.nextInt();
            if (R < (X * N)) {
                System.out.println(-1);
            } else {
                int b = (R - N * X) / (Y - X);
                b = Math.min(b, N);
                int a = N - b;
                System.out.println(a + " " + b);
            }
            T--;
        }
    }
}
