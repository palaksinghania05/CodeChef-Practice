package beginner1;

import java.util.ArrayList;
import java.util.Scanner;

public class ChefAndNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            ArrayList<Integer> listA = new ArrayList<>();
            ArrayList<Integer> listB = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                if (arr[j] >= 0) {
                    listA.add(arr[j]);
                } else {
                    listB.add(arr[j]);
                }
            }
            if (listA.size() == 0) {
                System.out.println(listB.size() + " " + listB.size());
            } else if (listB.size() == 0) {
                System.out.println(listA.size() + " " + listA.size());
            } else {
                System.out.println(Math.max(listA.size(), listB.size()) + " " + Math.min(listA.size(), listB.size()));
            }
            T--;
        }
    }
}
