package beginner1;

import java.util.HashMap;
import java.util.Scanner;

public class Buy1Get1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String s = sc.next();
            HashMap<Character, Integer> hashmap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (!hashmap.containsKey(s.charAt(i))) {
                    hashmap.put(s.charAt(i), 1);
                } else {
                    hashmap.put(s.charAt(i), hashmap.get(s.charAt(i)) + 1);
                }
            }
            int cost = 0;
            for (char ele : hashmap.keySet()) {
                if (hashmap.get(ele) % 2 == 0) {
                    cost = cost + (hashmap.get(ele) / 2);
                } else {
                    cost = cost + ((hashmap.get(ele) + 1) / 2);
                }
            }
            System.out.println(cost);
            T--;
        }
    }
}
