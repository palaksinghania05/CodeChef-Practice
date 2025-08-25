package beginner2;

import java.util.Scanner;

public class HTMLTags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String S = sc.next();
            if (S.length() < 4) {
                System.out.println("Error");
            } else if (S.charAt(0) != '<' || S.charAt(S.length() - 1) != '>' || S.charAt(1) != '/') {
                System.out.println("Error");
            } else {
                boolean flag = true;
                for (int i = 2; i < S.length() - 1; i++) {
                    if ((S.charAt(i) >= 'a' && S.charAt(i) <= 'z') || (S.charAt(i) >= '0' && S.charAt(i) <= '9')) {
                        continue;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Success");
                } else {
                    System.out.println("Error");
                }
            }
        }
    }
}
