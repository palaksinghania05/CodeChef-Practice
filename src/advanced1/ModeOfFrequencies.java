package advanced1;

import java.util.HashMap;
import java.util.Scanner;

public class ModeOfFrequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[10];
            for (int i = 0; i < N; i++) {
                arr[sc.nextInt() - 1]++;
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            int max = 0, result = 0;
            for (int i = 0; i < 10; i++) {
                if (arr[i] > 0) {
                    if (map.containsKey(arr[i])) {
                        map.put(arr[i], map.get(arr[i]) + 1);
                    } else {
                        map.put(arr[i], 1);
                    }
                    if (map.get(arr[i]) == max)
                        result = Math.min(arr[i], result);
                    else {
                        if (map.get(arr[i]) > max) {
                            max = map.get(arr[i]);
                            result = arr[i];
                        }
                    }
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
