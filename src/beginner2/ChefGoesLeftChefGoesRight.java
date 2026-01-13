package beginner2;

import java.util.Scanner;

public class ChefGoesLeftChefGoesRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int R = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            boolean flag = true;
            int[] A = new int[]{1, (int) (1e9)};
            for (int i = 0; i < N; i++) {
                if (i != N - 1 && arr[i] == R) {
                    flag = false;
                    break;
                }
                int temp = arr[i];
                if (temp < A[0] || temp > A[1]) {
                    flag = false;
                    break;
                }
                if (R > temp) {
                    A[0] = temp;
                } else {
                    A[1] = temp;
                }
            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
