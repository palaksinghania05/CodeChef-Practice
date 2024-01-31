package advanced1;

import java.util.Scanner;

public class ChefAndNotebooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int K = sc.nextInt();
            int N = sc.nextInt();
            boolean flag = false;
            int[] Pi = new int[N];
            int[] Ci = new int[N];
            int temp = X - Y;
            for (int i = 0; i < N; i++) {
                Pi[i] = sc.nextInt();
                Ci[i] = sc.nextInt();
                if (Pi[i] >= temp && Ci[i] <= K) {
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("UnluckyChef");
            } else
                System.out.println("LuckyChef");
            T--;
        }
    }
}
