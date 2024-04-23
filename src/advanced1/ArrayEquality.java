package advanced1;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int key = sc.nextInt();
                if (map.containsKey(key))
                    map.put(key, map.get(key) + 1);
                else
                    map.put(key, 1);
            }
            int max = 1;
            for (int i : map.values()) {
                if (max < i)
                    max = i;
            }
            if (max <= (N - max) + 1)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
