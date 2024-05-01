package advanced1;

import java.util.Scanner;

public class YourNameIsMine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String M = sc.next();
            String W = sc.next();
            int l1 = M.length();
            int l2 = W.length();
            int max = Math.max(l1, l2);
            boolean canMarry = true;
            if (M.equals(W)) {
                System.out.println("YES");
            } else {
                int lastIndex = 0;
                if (max == l1) {
                    for (int i = 0; i < l2; i++) {
                        char ch = W.charAt(i);
                        int index = M.indexOf(ch, lastIndex);
                        if (index == -1) {
                            canMarry = false;
                            break;
                        } else {
                            lastIndex = index + 1;
                        }
                    }
                } else {
                    for (int i = 0; i < l1; i++) {
                        char ch = M.charAt(i);
                        int index = W.indexOf(ch, lastIndex);
                        if (index == -1) {
                            canMarry = false;
                            break;
                        } else {
                            lastIndex = index + 1;
                        }
                    }
                }
                if (canMarry)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            T--;
        }
    }
}
