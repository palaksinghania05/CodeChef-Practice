package beginner2;

import java.util.Arrays;
import java.util.Scanner;

public class WarriorChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int H = sc.nextInt();
            int sum = 0;
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                sum += A[i];
            }
            if (sum < H)
                System.out.println(0);
            else {
                sum = 0;
                Arrays.sort(A);
                for (int i = N - 1; i >= 0; i--) {
                    sum += A[i];
                    if (sum >= H) {
                        System.out.println(A[i]);
                        break;
                    }
                }
            }
        }
    }
}
