package beginner2;

import java.util.Scanner;

public class MagicSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int count = 0;
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                if (ele % M == 0) {
                    count++;
                }
            }
            System.out.println((int) Math.pow(2, count) - 1);
            T--;
        }
    }
}
