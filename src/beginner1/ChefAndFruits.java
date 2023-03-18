package beginner1;

import java.util.Scanner;

public class ChefAndFruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            int difference = Math.abs(N - M);
            if (difference <= K)
                System.out.println(0);
            else
                System.out.println(difference - K);
            T--;
        }
    }
}
