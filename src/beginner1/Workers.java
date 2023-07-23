package beginner1;

import java.util.HashMap;
import java.util.Scanner;

public class Workers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] arr2 = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            arr2[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(arr2[i])) {
                map.put(arr2[i], arr[i]);
            } else {
                if (arr[i] < map.get(arr2[i])) {
                    map.put(arr2[i], arr[i]);
                }
            }
        }
        if (map.containsKey(1) && map.containsKey(2) && map.containsKey(3)) {
            int a = map.get(1) + map.get(2);
            int b = map.get(3);
            if (a < b) {
                System.out.println(a);
            } else if (b < a) {
                System.out.println(b);
            } else {
                System.out.println(b);
            }
        } else if (!map.containsKey(3)) {
            System.out.println(map.get(1) + map.get(2));
        } else if (!map.containsKey(1) || !map.containsKey(2)) {
            System.out.println(map.get(3));
        }
    }
}
