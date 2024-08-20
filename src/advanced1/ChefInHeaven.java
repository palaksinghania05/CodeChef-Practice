package advanced1;

import java.util.Scanner;

public class ChefInHeaven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            boolean flag = false;
            int count1 = 0, count2 = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '0')
                    count1++;
                else
                    count2++;

                if (count2 >= count1) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
