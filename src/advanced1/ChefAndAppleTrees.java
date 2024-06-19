package advanced1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChefAndAppleTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                set.add(x);
            }
            System.out.println(set.size());
            T--;
        }
    }
}
