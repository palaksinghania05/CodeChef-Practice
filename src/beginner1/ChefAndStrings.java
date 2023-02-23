package beginner1;

import java.util.Scanner;

public class ChefAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            long strings = 0;
            for (int i = 0; i < N - 1; i++) {
                strings += (long) Math.abs(arr[i + 1] - arr[i]) - 1;
            }
            System.out.println(strings);
            T--;
        }
    }
}
