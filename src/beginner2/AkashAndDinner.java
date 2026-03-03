package beginner2;

import java.util.*;

public class AkashAndDinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int[] B = new int[N];
            for (int j = 0; j < N; j++) {
                B[j] = sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                if (map.containsKey(A[i])) {
                    if (B[i] < map.get(A[i])) {
                        map.put(A[i], B[i]);
                    }
                } else {
                    map.put(A[i], B[i]);
                }
            }
            if (map.size() < K) {
                System.out.println(-1);
            } else {
                long result = 0;
                ArrayList<Integer> list = new ArrayList<>();
                for (Map.Entry<Integer, Integer> map2 : map.entrySet()) {
                    list.add(map2.getValue());
                }
                Collections.sort(list);
                for (int i = 0; i < K; i++) {
                    result += list.get(i);
                }
                System.out.println(result);
            }
        }
    }
}
