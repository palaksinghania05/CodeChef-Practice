package advanced2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChefAndReplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            long K = sc.nextLong();
            Map<Integer, Long> map = new HashMap<>();
            int i;
            for (i = 0; i < N; i++) {
                int X = sc.nextInt();
                map.put(X, map.getOrDefault(X, 0l) + 1l);
            }
            long result = 0;
            boolean flag = false;
            for (int x : map.keySet()) {
                if (map.get(x) == K) {
                    result += x;
                    flag = true;
                }
            }
            if (!flag)
                System.out.println(-1);
            else
                System.out.println(result);
        }
    }
}
