package advanced1;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemDifficulties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int[] arr = new int[4];
            for (int i = 0; i < 4; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (arr[1] != arr[2] || arr[0] != arr[1] && arr[2] != arr[3])
                System.out.println(2);
            else if (arr[0] == arr[3])
                System.out.println(0);
            else
                System.out.println(1);
            T--;
        }
    }
}
