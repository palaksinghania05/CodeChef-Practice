package advanced1;

import java.util.Scanner;

public class FootballMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            if (N > 0) {
                String teamA = sc.next();
                String teamB = "";
                int countA = 1, countB = 0;
                for (int i = 1; i < N; i++) {
                    String temp = sc.next();
                    if (temp.equals(teamA))
                        countA++;
                    else {
                        if (countB == 0) {
                            teamB = temp;
                        }
                        countB++;
                    }
                }
                if (countA > countB)
                    System.out.println(teamA);
                else if (countB > countA)
                    System.out.println(teamB);
                else
                    System.out.println("Draw");

            } else {
                System.out.println("Draw");
            }
            T--;
        }
    }
}
