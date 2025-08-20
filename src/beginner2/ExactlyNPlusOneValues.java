package beginner2;

import java.util.Scanner;

public class ExactlyNPlusOneValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextInt();
            System.out.print('1' + " ");
            long sum = 1;
            long totalsum = 0;
            totalsum = (long) Math.pow(2, N);
            for (int i = 1; i < N; i++) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.print(totalsum - sum);
            System.out.println();
        }
    }
}
