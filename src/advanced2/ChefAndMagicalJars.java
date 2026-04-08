package advanced2;

import java.util.Scanner;

public class ChefAndMagicalJars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                sum = sum + a;
            }
            System.out.println(sum - N + 1);
        }
    }
}
