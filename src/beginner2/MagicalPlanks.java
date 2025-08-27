package beginner2;

import java.util.Scanner;

public class MagicalPlanks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int N = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int countB = 0;
            int countW = 0;
            char temp = ' ';
            for (int i = 0; i < N; i++) {
                char curr = s.charAt(i);
                if (curr != temp) {
                    if (curr == 'B')
                        countB++;
                    else
                        countW++;
                    temp = curr;
                }
            }
            System.out.println(Math.min(countB, countW));
        }
    }
}
