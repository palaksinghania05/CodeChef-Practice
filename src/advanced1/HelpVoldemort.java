package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class HelpVoldemort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long sum = 0;
        for (int i = 1; i < N; i++) {
            sum = sum + (long) arr[i - 1] * arr[i];
        }
        System.out.println(sum);
    }
}
