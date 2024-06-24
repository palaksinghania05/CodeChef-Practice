package advanced1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiftRift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] gifts = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                gifts[i][j] = sc.nextInt();
            }
        }
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < C; j++) {
                if (gifts[i][j] < min) {
                    min = gifts[i][j];
                }
            }
            row.add(min);
        }
        int result = -1;
        for (Integer integer : row) {
            for (int i = 0; i < C; i++) {
                int max = Integer.MIN_VALUE;
                for (int j = 0; j < R; j++) {
                    max = Math.max(max, gifts[j][i]);
                }
                if (integer == max)
                    result = integer;
            }
        }
        if (result == -1)
            System.out.println("GUESS");
        else
            System.out.println(result);
    }
}
