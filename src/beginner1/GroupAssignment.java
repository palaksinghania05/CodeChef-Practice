package beginner1;

import java.util.HashMap;
import java.util.Scanner;

public class GroupAssignment {
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
            int f = 0;
            for (int e : map.keySet()) {
                if (map.get(e) % e != 0) {
                    f = 1;
                    break;
                }
            }
            if (f == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
