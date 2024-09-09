package advanced1;

import java.util.Scanner;

public class MakeThemZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int sum = 0, count = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                sum = sum | arr[i];
            }
            while (sum != 0) {
                count++;
                sum = sum & (sum - 1);
            }
            System.out.println(count);
            T--;
        }
    }
}
