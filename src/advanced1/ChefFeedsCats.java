package advanced1;

import java.util.HashSet;
import java.util.Scanner;

public class ChefFeedsCats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int flag = 0;
            HashSet<Integer> set = new HashSet<>();
            while (M > 0) {
                int x = sc.nextInt();
                if (flag == 0) {
                    if (set.contains(x)) {
                        if (set.size() != N)
                            flag = 1;
                        else
                            set.clear();
                    }
                    set.add(x);
                }
                M--;
            }
            if (flag == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
