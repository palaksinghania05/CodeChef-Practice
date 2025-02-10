package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndKingship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long result = 0;
            for (int i = 1; i < arr.length; i++) {
                result = result + arr[0] * arr[i];
            }
            System.out.println(result);
            T--;
        }
    }
}
