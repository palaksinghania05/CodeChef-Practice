package advanced1;

import java.util.Scanner;

public class MinimumDistanceBetween1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int temp1 = 0;
            int temp2 = 0;
            boolean flag = false;
            if (N == 2)
                System.out.println(1);
            else {
                for (int i = 0; i < N; i++) {
                    if (i % 2 == 0 && S.charAt(i) == '1')
                        temp1++;
                    else if (i % 2 == 1 && S.charAt(i) == '1')
                        temp2++;
                    if (temp1 > 0 && temp2 > 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag)
                    System.out.println(1);
                else
                    System.out.println(2);
            }
            T--;
        }
    }
}
