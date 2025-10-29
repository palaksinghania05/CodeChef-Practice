package beginner2;

import java.util.Scanner;

public class CoursesInAnUniversity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int result = -1;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > result)
                    result = arr[i];
            }
            System.out.println(n - result);
        }
    }
}
