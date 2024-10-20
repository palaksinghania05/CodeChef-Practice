package advanced1;

import java.util.Scanner;

public class MakeABSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] a = new int[N];
            int[] b = new int[N];
            int temp1 = 0;
            int temp2 = 0;
            boolean flag = true;
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                b[i] = sc.nextInt();
            }
            if (a[0] != b[0] || a[N - 1] != b[N - 1]) {
                flag = false;
            } else {
                for (int i = 0; i < N; i++) {
                    if (a[i] == 0) {
                        temp1 += 1;
                    } else
                        temp2 += 1;
                }
                for (int i = 1; i < N - 1; i++) {
                    if (a[i] != b[i] && a[i] == 0 && temp2 == 0) {
                        flag = false;
                    }
                    if (a[i] != b[i] && a[i] == 1)
                        flag = false;
                }
            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
