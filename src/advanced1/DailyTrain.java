package advanced1;

import java.util.Scanner;

public class DailyTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[10];
        int count = 0;
        int[] arr2 = new int[10];
        arr2[0] = 1;
        for (int i = 1; i < 7; i++) {
            arr2[i] = arr2[i - 1] * i;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                arr[j] = 0;
            }
            String s = sc.next();
            for (int j = 0; j < 54; j++) {
                if (s.charAt(j) == '0') {
                    if (j < 36) {
                        arr[j / 4]++;
                    } else {
                        arr[8 - (j - 36) / 2]++;
                    }
                }
            }
            for (int j = 0; j < 9; j++) {
                if (arr[j] >= X) {
                    count += arr2[arr[j]] / (arr2[X] * arr2[arr[j] - X]);
                }
            }
        }
        System.out.print(count);
    }
}
