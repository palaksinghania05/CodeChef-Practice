package beginner2;

import java.util.Scanner;

public class MinimumAndMaximum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextInt();
            long sum = N * (N + 1);
            sum /= 2;
            sum += N - 1;
            System.out.println(sum);
        }
    }
}
