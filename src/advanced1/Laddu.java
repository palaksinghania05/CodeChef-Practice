package advanced1;

import java.util.Scanner;

public class Laddu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int activities = sc.nextInt();
            String origin = sc.next();
            int point = 0;
            for (int i = 1; i <= activities; i++) {
                String activity = sc.next();
                int rank = 0;
                if (activity.equals("CONTEST_WON") || activity.equals("BUG_FOUND")) {
                    rank = sc.nextInt();
                }
                if (activity.equals("CONTEST_WON")) {
                    point += 300;
                    if (rank <= 20) {
                        point += 20 - rank;
                    }
                } else if (activity.equals("TOP_CONTRIBUTOR")) {
                    point += 300;
                } else if (activity.equals("BUG_FOUND")) {
                    point += rank;
                } else if (activity.equals("CONTEST_HOSTED")) {
                    point += 50;
                }
            }
            int result = 0;
            if (origin.equals("INDIAN")) {
                result = point / 200;
            } else {
                result = point / 400;
            }
            System.out.println(result);
            T--;
        }
    }
}
