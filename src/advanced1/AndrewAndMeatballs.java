package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class AndrewAndMeatballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            long[] p = new long[(int) N];
            for (int i = 0; i < N; i++) {
                p[i] = sc.nextLong();
            }
            Arrays.sort(p);
            long sum = 0;
            int count = 0;
            int flag = 0;
            for (int i = (int) (N - 1); i >= 0; i--) {
                sum += p[i];
                count++;
                if (sum >= M) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(count);
            else
                System.out.println(-1);
            T--;
        }
    }
}
