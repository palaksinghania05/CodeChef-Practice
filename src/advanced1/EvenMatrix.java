package advanced1;

import java.util.Scanner;

public class EvenMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextLong();
            long M = 1;
            for (long i = 0; i < N; i++) {
                for (long j = 0; j < N; j++) {
                    if (N % 2 == 1)
                        System.out.print(M + " ");
                    else {
                        if (i % 2 == 1) {
                            if (j % 2 == 0)
                                System.out.print((M + 1) + " ");
                            else
                                System.out.print((M - 1) + " ");
                        } else
                            System.out.print(M + " ");
                    }
                    M++;
                }
                System.out.println();
            }
            T--;
        }
    }
}
