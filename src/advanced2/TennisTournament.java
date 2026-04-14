package advanced2;

import java.util.Scanner;

public class TennisTournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if ((N - 1) % 2 == 0) {
                System.out.println("YES");
                int i;
                for (i = 0; i < N; i++) {
                    int[] a = new int[N];
                    int k = 0;
                    for (int j = (i + 1) % N; ; j++) {
                        if (k < (N - 1) / 2) {
                            a[j % N] = 1;
                            k++;
                        } else {
                            break;
                        }
                    }
                    for (int j = 0; j < N; j++)
                        System.out.print(a[j]);
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
