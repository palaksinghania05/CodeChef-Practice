package advanced1;

import java.util.Scanner;

public class XennyAndCoinRankings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int U = sc.nextInt();
            int V = sc.nextInt();
            long temp = U + V;
            long rank = (temp * (temp + 1)) / 2;
            System.out.println(rank + U + 1);
            T--;
        }
    }
}
