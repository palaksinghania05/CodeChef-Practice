package beginner;

import java.util.Scanner;

public class FillTheGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (((N % 2) == 0) && ((M % 2) == 0))
                System.out.println(0);
            else if (N % 2 == 0)
                System.out.println(N);
            else if (M % 2 == 0)
                System.out.println(M);
            else
                System.out.println(((N % 2) * M) + ((M % 2) * N) - 1);

            T--;
        }
    }
}
