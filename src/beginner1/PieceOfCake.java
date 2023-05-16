package beginner1;

import java.util.HashMap;
import java.util.Scanner;

public class PieceOfCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String s = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), 1);
                } else {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                }
            }
            int max = Integer.MIN_VALUE;
            for (char key : map.keySet()) {
                if (map.get(key) > max) {
                    max = map.get(key);
                }
            }
            if (s.length() - max == max) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
