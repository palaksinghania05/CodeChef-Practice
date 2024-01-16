package advanced1;

import java.util.HashMap;
import java.util.Scanner;

public class PopularRiceRecipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            HashMap<String, Character> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                map.put(sc.next(), sc.next().charAt(0));
            }
            int score = 0;
            for (String key : map.keySet()) {
                if (map.get(key) == '+') {
                    score = score + 1;
                } else if (map.get(key) == '-') {
                    score = score - 1;
                }
            }
            System.out.println(score);
            T--;
        }
    }
}
