package advanced1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PairingChefs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[M][2];
            for (int i = 0; i < M; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            List<Integer> list = new ArrayList<>();
            boolean[] tempArr = new boolean[N];
            for (int j = M - 1; j >= 0; j--) {
                if (!tempArr[arr[j][0]] && !tempArr[arr[j][1]]) {
                    tempArr[arr[j][0]] = true;
                    tempArr[arr[j][1]] = true;
                    list.add(j);
                }
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            T--;
        }
    }
}
