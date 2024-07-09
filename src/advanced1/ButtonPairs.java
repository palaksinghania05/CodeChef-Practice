package advanced1;

import java.util.Scanner;

public class ButtonPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            long even = 0L;
            long odd = 0L;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            long result = even * odd;
            System.out.println(result);
            T--;
        }
    }
}
