package beginner2;

import java.util.Scanner;

public class NameReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String AB = sc.next();
            AB += sc.next();
            int N = sc.nextInt();
            StringBuilder C = new StringBuilder();
            for (int i = 0; i < N; i++) {
                C.append(sc.next());
            }
            int[] arr = new int[26];
            for (int i = 0; i < AB.length(); i++) {
                arr[(AB.charAt(i) - 'a')]++;
            }
            int flag = 1;
            for (int i = 0; i < C.length(); i++) {
                if (arr[(C.charAt(i) - 'a')] <= 0) {
                    flag = 0;
                    break;
                }
                arr[(C.charAt(i) - 'a')]--;
            }
            if (flag == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
