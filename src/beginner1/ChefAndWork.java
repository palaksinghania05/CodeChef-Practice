package beginner1;

import java.util.Scanner;

public class ChefAndWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int j = 0;
            int count = 0;
            int temp = 0;
            int flag = 0;
            while (j < N) {
                if (arr[j] > K) {
                    System.out.println("-1");
                    flag = 1;
                    break;
                }
                temp += arr[j];
                if (temp <= K) {
                    j++;
                } else {
                    count++;
                    temp = 0;
                }
            }
            if (flag == 0)
                System.out.println(count + 1);
            T--;
        }
    }
}
