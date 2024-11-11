package advanced1;

import java.util.Scanner;

public class CovidSpread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int D = sc.nextInt();
            long temp = 1;
            for (int i = 1; i <= D; i++) {
                if (i <= 10) temp *= 2;
                else temp *= 3;
                if (temp > N) {
                    temp = N;
                    break;
                }
            }
            System.out.println(temp);
            T--;
        }
    }
}
