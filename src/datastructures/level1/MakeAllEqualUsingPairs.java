/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 13-07-2022
 */

package datastructures.level1;

import java.util.HashSet;
import java.util.Scanner;

public class MakeAllEqualUsingPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                set.add(sc.nextInt());
            }
            if (set.size() == N)
                System.out.println(N - 1);
            else if (set.size() == 1)
                System.out.println(0);
            else
                System.out.println(N - set.size());
            T--;
        }
    }
}
