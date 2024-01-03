package advanced1;

import java.util.HashMap;
import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (!map.containsKey(arr[i])) {
                    map.put(arr[i], 1);
                } else {
                    map.put(arr[i], map.get(arr[i]) + 1);
                }
            }
            long result = 0;
            for (int p : map.values()) {
                result += (long) p * (p - 1) / 2;
            }
            System.out.println(result);
            T--;
        }
    }
}
