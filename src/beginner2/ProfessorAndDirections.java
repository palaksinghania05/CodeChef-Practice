package beginner2;

import java.util.Scanner;

public class ProfessorAndDirections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            if (S.contains("LL") || S.contains("RR")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
