package beginner2;

import java.util.Scanner;

public class ChefAndGirlfriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0) {
            String t1 = sc.nextLine().trim();
            String t2 = sc.nextLine().trim();
            int dist = Integer.parseInt(sc.nextLine());
            String[] gf = t1.split(":");
            String[] ch = t2.split(":");
            int gfTime = Integer.parseInt(gf[0]) * 60 + Integer.parseInt(gf[1]);
            int chefTime = Integer.parseInt(ch[0]) * 60 + Integer.parseInt(ch[1]);
            int diff = Math.abs(gfTime - chefTime);
            double ans1 = diff + dist;
            double ans2 = (2 * dist <= diff) ? diff : diff / 2.0 + dist;
            System.out.printf("%.1f %.1f\n", ans1, ans2);
        }
    }
}
