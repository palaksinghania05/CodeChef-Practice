package advanced1;

import java.util.Scanner;

public class SpoonInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            sc.nextLine();
            char[][] arr = new char[R][C];
            for (int i = 0; i < R; i++) {
                String row = sc.nextLine().toLowerCase();
                arr[i] = row.toCharArray();
            }
            boolean flag = false;
            if (R < 5 && C < 5) {
                System.out.println("There is indeed no spoon!");
            } else {
                for (int i = 0; i < R; i++) {
                    for (int j = 0; j < C; j++) {
                        if (j + 4 < C && arr[i][j] == 's' && arr[i][j + 1] == 'p' && arr[i][j + 2] == 'o' && arr[i][j + 3] == 'o' && arr[i][j + 4] == 'n') {
                            flag = true;
                        }
                        if (i + 4 < R && arr[i][j] == 's' && arr[i + 1][j] == 'p' && arr[i + 2][j] == 'o' && arr[i + 3][j] == 'o' && arr[i + 4][j] == 'n') {
                            flag = true;
                        }
                    }
                }
                if (flag) {
                    System.out.println("There is a spoon!");
                } else {
                    System.out.println("There is indeed no spoon!");
                }
            }
            T--;
        }
    }
}
