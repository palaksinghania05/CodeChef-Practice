package advanced1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimumMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            ArrayList<Integer> list = new ArrayList<>();
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                list.add(ele);
            }
            Collections.sort(list);
            long temp = list.get(0);
            System.out.println(temp * (N - 1));
        }
    }
}
