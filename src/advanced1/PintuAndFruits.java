package advanced1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class PintuAndFruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] F = new int[N];
            for (int i = 0; i < N; i++) {
                F[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int ele = F[i];
                if (map.containsKey(ele)) {
                    map.put(ele, map.get(ele) + sc.nextInt());
                } else {
                    map.put(ele, sc.nextInt());
                }
            }
            int result = Collections.min(map.values());
            System.out.println(result);
            T--;
        }
    }
}
