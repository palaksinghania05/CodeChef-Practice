package beginner2;

import java.util.Scanner;

public class ChefAndRainbowArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            boolean flag = true;
            for (int i = 0; i < N / 2; i++) {
                if (A[i] != A[N - 1 - i]) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                System.out.println("no");
                continue;
            }
            int temp = 1;
            for (int i = 0; i <= N / 2; i++) {
                int ele = A[i];
                if (ele < 1 || ele > 7) {
                    flag = false;
                    break;
                }
                if (ele == temp) {
                    continue;
                } else if (ele == temp + 1) {
                    temp++;
                } else {
                    flag = false;
                    break;
                }
            }
            if (temp != 7) {
                flag = false;
            }
            System.out.println(flag ? "yes" : "no");
        }
    }
}
