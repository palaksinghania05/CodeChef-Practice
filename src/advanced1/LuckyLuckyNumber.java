package advanced1;

import java.util.Scanner;

public class LuckyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            boolean flag = false;
            for (int i = N; i >= 0; i = i - 4) {
                if (i % 7 == 0) {
                    System.out.println(i);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(-1);
            }
            T--;
        }
    }
}
