package advanced1;

import java.util.HashMap;
import java.util.Scanner;

public class ChefAndRecipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            boolean flag = true;
            for (int j = 0; j < N; j++) {
                if (map.containsKey(arr[j])) {
                    flag = false;
                    break;
                }
                int count = 1;
                while (j < N - 1 && arr[j] == arr[j + 1]) {
                    count++;
                    j++;
                }
                if (map.containsValue(count)) {
                    flag = false;
                    break;
                }
                map.put(arr[j], count);

            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
