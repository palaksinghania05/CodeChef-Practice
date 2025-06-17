package beginner2;

import java.util.HashMap;
import java.util.Scanner;

public class FitToPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int max = -1;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = N - 1; i >= 0; i--) {
                max = Math.max(max, arr[i]);
                map.put(i, max);
            }
            int diff = 0;
            for (int i = 0; i < N; i++) {
                diff = Math.max(diff, map.get(i) - arr[i]);
            }
            if (diff == 0)
                System.out.println("UNFIT");
            else
                System.out.println(diff);
        }
    }
}
