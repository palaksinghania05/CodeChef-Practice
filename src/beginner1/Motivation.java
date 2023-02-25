package beginner1;

import java.util.HashMap;
import java.util.Scanner;

public class Motivation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                map.put(sc.nextInt(), sc.nextInt());
            }
            int result = 0;
            for (int ele : map.keySet()) {
                if (ele <= X)
                    result = Math.max(result, map.get(ele));
            }
            System.out.println(result);
            T--;
        }
    }
}
