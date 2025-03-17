package advanced1;

import java.util.Scanner;

public class ChefAndNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int[] flag = new int[1002];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int temp = arr[0], count = 0;
            flag[arr[0]]++;
            for (int i = 1; i < N; i++) {
                if (temp == arr[i] && count == 0) {
                    count = 1;
                    continue;
                }
                count = 0;
                temp = arr[i];
                flag[arr[i]]++;
            }
            int max = 0, result = 0;
            for (int i = 1; i < 1002; i++) {
                if (max < flag[i]) {
                    max = flag[i];
                    result = i;
                }
            }
            System.out.println(result);
        }
    }
}
