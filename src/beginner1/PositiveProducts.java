package beginner1;

import java.util.Scanner;

public class PositiveProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long neg = 0;
            long pos = 0;
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextLong();
                if (arr[i] < 0)
                    neg++;
                if (arr[i] > 0)
                    pos++;
            }
            long ans = ((neg * (neg - 1)) / 2) + ((pos * (pos - 1)) / 2);
            System.out.println(ans);
            T--;
        }
    }
}
