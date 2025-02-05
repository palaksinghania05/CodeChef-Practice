package advanced1;

import java.util.Scanner;

public class ChefAndProxy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int temp1 = 0, temp2 = 0;
            char[] a = S.toCharArray();
            for (int i = 0; i < N; i++) {
                if (a[i] == 'P')
                    temp1++;
            }
            for (int i = 2; i < N - 2; i++) {
                if ((double) temp1 / N >= 0.75)
                    break;
                else if (a[i] == 'A' && (a[i - 1] == 'P' || a[i - 2] == 'P') && (a[i + 1] == 'P' || a[i + 2] == 'P')) {
                    temp1++;
                    temp2++;
                }
            }
            if ((double) temp1 / N < 0.75)
                System.out.println(-1);
            else
                System.out.println(temp2);
            T--;
        }
    }
}
