package beginner2;

import java.util.HashMap;
import java.util.Scanner;

public class emitL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String S = sc.next();
            int N = S.length();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < N; j++) {
                if (!map.containsKey(S.charAt(j))) {
                    map.put(S.charAt(j), 1);
                } else {
                    map.put(S.charAt(j), map.get(S.charAt(j)) + 1);
                }
            }
            if (map.containsKey('L') && map.containsKey('T') && map.containsKey('I') && map.containsKey('M') && map.containsKey('E')) {
                if (N == 9) {
                    if (map.get('L') >= 2 && map.get('T') >= 2 && map.get('I') >= 2 && map.get('M') >= 2 && map.get('E') >= 1) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    if (map.get('L') >= 2 && map.get('T') >= 2 && map.get('I') >= 2 && map.get('M') >= 2 && map.get('E') >= 2) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
