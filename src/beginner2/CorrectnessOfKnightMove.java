package beginner2;

import java.util.Scanner;

public class CorrectnessOfKnightMove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            char[] S = sc.nextLine().toCharArray();
            boolean flag = true;
            if (S.length != 5) {
                System.out.println("Error");
            } else {
                char dash = S[2];
                char firstrow = S[0];
                char secondrow = S[3];
                char firstcol = S[1];
                char secondcol = S[4];
                if (dash != '-' || firstrow < 'a' || firstrow > 'h' || secondrow < 'a' || secondrow > 'h' || firstcol < '1' || firstcol > '8' || secondcol > '8' || secondcol < '1')
                    flag = false;
                if (!flag) {
                    System.out.println("Error");
                } else {
                    int temp1 = Math.abs(firstrow - secondrow);
                    int temp2 = Math.abs(firstcol - secondcol);
                    if ((temp1 == 1 && temp2 == 2) || (temp1 == 2 && temp2 == 1)) System.out.println("Yes");
                    else System.out.println("No");
                }
            }
        }
    }
}
