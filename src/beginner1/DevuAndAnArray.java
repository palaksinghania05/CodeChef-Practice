package beginner1;

import java.util.Scanner;

public class DevuAndAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] arr = new int[N];
        for (int j = 0; j < N; j++) {
            arr[j] = sc.nextInt();
        }
        int minimum = arr[0];
        for (int j = 0; j < N; j++) {
            if (minimum > arr[j]) {
                minimum = arr[j];
            }
        }
        int maximum = Integer.MIN_VALUE;
        for (int j = 0; j < N; j++) {
            if (maximum < arr[j]) {
                maximum = arr[j];
            }
        }
        for (int j = 0; j < Q; j++) {
            int t = sc.nextInt();
            if (t >= minimum && t <= maximum) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
