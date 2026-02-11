package beginner2;

import java.util.Scanner;

public class RowAndColumnOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] row = new int[N];
        int[] col = new int[N];
        int Q = sc.nextInt();
        while (Q-- > 0) {
            String res = sc.next();
            int num = sc.nextInt();
            int value = sc.nextInt();
            if (res.equals("RowAdd"))
                row[num - 1] += value;
            else
                col[num - 1] += value;
        }
        int max_col = 0, max_row = 0;
        for (int i = 0; i < N; i++) {
            max_col = Math.max(max_col, col[i]);
            max_row = Math.max(max_row, row[i]);
        }
        System.out.println(max_row + max_col);
    }
}
