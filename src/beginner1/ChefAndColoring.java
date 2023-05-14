package beginner1;

import java.util.HashMap;
import java.util.Scanner;

public class ChefAndColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                if (map.containsKey(s.charAt(i)))
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                else
                    map.put(s.charAt(i), 1);
            }
            int max = Integer.MIN_VALUE;
            for (char ele : map.keySet()) {
                max = Math.max(max, map.get(ele));
            }
            System.out.println(N - max);
            T--;
        }
    }
}
