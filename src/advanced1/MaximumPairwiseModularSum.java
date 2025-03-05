package advanced1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class MaximumPairwiseModularSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++)
                set.add(sc.nextInt());
            ArrayList<Integer> list = new ArrayList<>(set);
            list.sort(Collections.reverseOrder());
            int temp1 = list.get(0);
            int temp2 = list.get(1);
            System.out.println(Math.max((temp1 + temp1), temp1 + temp2 + Math.max((temp1 - temp2) % M, ((temp2 - temp1) % M) + M)));
        }
    }
}
