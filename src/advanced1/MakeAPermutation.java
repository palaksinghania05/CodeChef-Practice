package advanced1;

import java.util.HashSet;
import java.util.Scanner;

public class MakeAPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            HashSet<Integer> set = new HashSet<>();
            for (int i = 1; i <= N; i++) {
                set.add(i);
            }
            for (int i = 0; i < N; i++) {
                set.remove(arr[i]);
            }
            System.out.println(set.size());
            T--;
        }
    }
}
