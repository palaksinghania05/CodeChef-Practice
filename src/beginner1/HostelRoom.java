package beginner1;

import java.util.Scanner;

public class HostelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] arr = new int[N];
            int sum = X;
            int max = X;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
                max = Math.max(sum, max);
            }
            System.out.println(max);
            T--;
        }
    }
}
