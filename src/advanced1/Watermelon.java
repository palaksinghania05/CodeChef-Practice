package advanced1;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
            int temp1 = 0;
            int temp2 = 0;
            for (int i = 0; i < N; i++) {
                if (a[i] > 0)
                    temp1 += a[i];
                else
                    temp2 += Math.abs(a[i]);
            }
            if (temp2 > temp1)
                System.out.println("NO");
            else
                System.out.println("YES");
            T--;
        }
    }
}
