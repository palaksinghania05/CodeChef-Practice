package advanced1;

import java.util.Scanner;

public class DifferenceMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int i;
            int[] arr = new int[N * N];
            int temp = 1;
            for (i = 0; i < arr.length; i++) {
                arr[i] = temp;
                temp = temp + 2;
                if (temp > N * N) temp = 2;
            }
            temp = 0;
            for (i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[temp++] + " ");
                }
                System.out.println();
            }
            T--;
        }
    }
}
