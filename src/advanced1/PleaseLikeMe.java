package advanced1;

import java.util.Scanner;

public class PleaseLikeMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int L = sc.nextInt();
            int D = sc.nextInt();
            int S = sc.nextInt();
            int C = sc.nextInt();
            long temp = 0;
            boolean flag = false;
            for (int i = 1; i <= D; i++) {
                if (i == 1)
                    temp += S;
                else
                    temp *= (C + 1);
                if (temp >= L) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                System.out.println("ALIVE AND KICKING");
            else
                System.out.println("DEAD AND ROTTING");
            T--;
        }
    }
}
