package advanced1;

import java.util.ArrayList;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++)
            arr[i] = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < N; i++) {
            if (arr[i] < 0) {
                list.add(i);
                arr[i] = Math.abs(arr[i]);
                arr[i + 1] = arr[i + 1] * -1;
            }
        }
        if (arr[N] < 0)
            list.add(N);
        if (list.size() <= K) {
            System.out.println(list.size());
            for (int val : list) System.out.print(val + " ");
            System.out.println();
        }
    }
}
