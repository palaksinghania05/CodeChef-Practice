package advanced1;

import java.util.Scanner;

public class MaximiseScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = sc.nextInt();
            }
            int result = Math.min(Math.abs(nums[1] - nums[0]), Math.abs(nums[N - 1] - nums[N - 2]));
            for (int i = 1; i < N - 1; i++) {
                int score = Math.max(Math.abs(nums[i] - nums[i - 1]), Math.abs(nums[i + 1] - nums[i]));
                result = Math.min(score, result);
            }
            System.out.println(result);
        }
    }
}
