/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 02-02-2023
 */

package beginner1;

import java.util.HashMap;
import java.util.Scanner;

public class ChangeIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                if (!map.containsKey(ele))
                    map.put(ele, 1);
                else
                    map.put(ele, map.get(ele) + 1);
            }
            int maxCount = 0;
            for (int i : map.values()) {
                if (maxCount < i)
                    maxCount = i;
            }
            System.out.println(N - maxCount);
            T--;
        }
    }
}
