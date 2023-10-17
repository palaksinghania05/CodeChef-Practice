package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class MakingAMeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int countC = 0, countE = 0, countD = 0, countF = 0, countO = 0, countH = 0;
            for (int i = 0; i < N; i++) {
                String str = sc.next();
                char[] arr = str.toCharArray();
                for (char c : arr) {
                    switch (c) {
                        case 'c' -> countC++;
                        case 'o' -> countO++;
                        case 'd' -> countD++;
                        case 'e' -> countE++;
                        case 'h' -> countH++;
                        case 'f' -> countF++;
                    }
                }
            }
            countC = countC / 2;
            countE = countE / 2;
            int[] arr1 = new int[]{countC, countE, countO, countD, countH, countF};
            Arrays.sort(arr1);
            System.out.println(arr1[0]);
            T--;
        }
    }
}
