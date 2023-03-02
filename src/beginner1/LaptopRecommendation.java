package beginner1;

import java.util.HashMap;
import java.util.Scanner;

public class LaptopRecommendation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int e = sc.nextInt();
                if (!map.containsKey(e))
                    map.put(e, 1);
                else
                    map.put(e, map.get(e) + 1);
            }
            // System.out.println(map);
            int result = 0;
            int max = Integer.MIN_VALUE;
            for (int e : map.keySet()) {
                if (map.get(e) > max) {
                    max = map.get(e);
                    result = e;
                    //    System.out.println("if" + result  + " " + max);
                } else if (map.get(e) == max) {
                    result = 0;
                    //     System.out.println("else" + result  + " " + max);
                }
            }
            if (result == 0) {
                System.out.println("CONFUSED");
            } else {
                System.out.println(result);
            }
            T--;
        }
    }
}
