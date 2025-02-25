package advanced1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimilarHeights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextLong();
            HashMap<Long, Long> arr = new HashMap<Long, Long>();
            long max = 0;
            for (long i = 0; i < N; i++) {
                long temp = sc.nextLong();
                if (arr.containsKey(temp)) {
                    arr.put(temp, arr.get(temp) + 1);
                } else {
                    arr.put(temp, (long) 1);
                    if (temp > max)
                        max = temp;
                }
            }
            boolean flag = false;
            long result = 0;
            for (Map.Entry<Long, Long> set :
                    arr.entrySet()) {
                if (set.getValue() == 1) {
                    result++;
                } else if (set.getValue() > 2)
                    flag = true;
            }
            if (result == 0)
                System.out.println("0");
            else if (!flag && result == 1 && arr.get(max) == 1) {
                System.out.println("2");
            } else {
                result = (++result) / 2;
                System.out.println(result);
            }
            T--;
        }
    }
}
