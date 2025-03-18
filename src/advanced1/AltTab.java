package advanced1;

import java.util.*;

public class AltTab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> S = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < N; i++)
            S.add(sc.next());
        Set<String> set = new HashSet<>();
        for (int i = N - 1; i >= 0; i--) {
            int length = S.get(i).length();
            String temp = S.get(i).substring(length - 2);
            if (!set.contains(S.get(i))) {
                result.add(temp);
                set.add(S.get(i));
            }
        }
        for (String s : result)
            System.out.print(s);
    }
}
