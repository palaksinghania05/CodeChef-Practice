package beginner1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DotifyPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int L = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < N; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (b == L) {
                    list.add(a);
                }
            }
            if (list.size() >= K) {
                int ans = 0;
                Collections.sort(list, Collections.reverseOrder());
                for (int i = 0; i < K; i++) {
                    ans = ans + list.get(i);
                }
                System.out.println(ans);
            } else {
                System.out.println(-1);
            }
            T--;
        }
    }
}
