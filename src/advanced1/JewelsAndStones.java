package advanced1;

import java.util.HashMap;
import java.util.Scanner;

public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String J = sc.next();
            String S = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (char ch : J.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            int result = 0;
            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                if (map.containsKey(ch)) {
                    result++;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
