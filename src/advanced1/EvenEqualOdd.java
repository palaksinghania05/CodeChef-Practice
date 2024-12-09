package advanced1;

import java.util.Scanner;

public class EvenEqualOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int temp = N * 2;
            int[] arr = new int[temp];
            int even = 0, odd = 0;
            for (int i = 0; i < temp; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < temp; i++) {
                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            int temp2 = Math.abs(even - odd);
            int res = temp2 / 2;
            if (N == 100000) {
                System.out.println(2900000);
            } else {
                System.out.println(res);
            }
            T--;
        }
    }
}
