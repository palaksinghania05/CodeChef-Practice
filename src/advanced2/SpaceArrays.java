package advanced2;

import java.util.Arrays;
import java.util.Scanner;

public class SpaceArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- != 0) {
            int N = sc.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int counter = 0, flag = 0;
            for (int i = 0; i < N; i++) {
                if (a[i] <= i + 1) {
                    counter += Math.abs(a[i] - (i + 1));
                } else {
                    System.out.println("Second");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                if (counter % 2 == 0) System.out.println("Second");
                else System.out.println("First");
            }
        }
    }
}
