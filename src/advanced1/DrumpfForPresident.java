package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class DrumpfForPresident {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr;
        int temp = 0;
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            arr = new int[N + 1];
            Arrays.fill(arr, 0);
            for (int i = 1; i <= N; i++) {
                temp = sc.nextInt();
                if (temp != i) {
                    arr[temp]++;
                } else {
                    arr[temp] = -1000;
                }
            }
            int count = 0;
            for (int i = 1; i <= N; i++) {
                if (arr[i] >= K) {
                    count++;
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
