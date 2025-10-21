package beginner2;

import java.util.*;

public class TotalCorrectSubmissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            Map<String, Long> map = new HashMap<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < N; j++) {
                    String code = sc.next();
                    long count = sc.nextLong();
                    map.put(code, map.getOrDefault(code, 0L) + count);
                }
            }
            List<Long> totals = new ArrayList<>(map.values());
            Collections.sort(totals);
            for (Long total : totals) {
                System.out.print(total + " ");
            }
            System.out.println();
        }
    }
}
