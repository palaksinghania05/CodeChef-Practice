package beginner2;

import java.util.HashSet;
import java.util.Scanner;

public class AlternatingDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int num = 1;
            int count = 1;
            HashSet<Integer> set = new HashSet<>();
            set.add(num);
            System.out.print(num + " ");
            for (int i = 1; i < N; i++) {
                if (i % 2 == 0) {
                    num = count;
                    while (set.contains(num)) {
                        num++;
                    }
                    System.out.print(num + " ");
                    set.add(num);
                    count = num;
                } else {
                    System.out.print(num * 2 + " ");
                    num *= 2;
                    set.add(num);
                }
            }
            System.out.println();
        }
    }
}
