package advanced1;

import java.util.HashSet;
import java.util.Scanner;

public class ChefDetective {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }
        for (int i = 0; i <= N; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
