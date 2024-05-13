package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class ClosingTheTweets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        boolean[] flag = new boolean[N];
        Arrays.fill(flag, false);
        for (int i = 0; i < K; i++) {
            String S = sc.next();
            if (S.length() == 5) {
                String val = sc.next();
                int num = Integer.parseInt(val);
                num--;
                flag[num] = !flag[num];
                int open = 0;
                for (int j = 0; j < N; j++)
                    if (flag[j]) open++;
                System.out.println(open);
            } else {
                Arrays.fill(flag, false);
                System.out.println(0);
            }
        }
    }
}
